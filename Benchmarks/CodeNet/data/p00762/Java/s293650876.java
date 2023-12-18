
import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;


import static java.lang.Math.*;
import static java.lang.System.*;

class Main {
	public static Random rand=new Random();

	public int[] dx=new int[]{1,0,-1,0};
	public int[] dy=new int[]{0,1,0,-1};
	public void run() {
		int[] rev=new int[]{0,6,5,4,3,2,1};

		int[][] rt=new int[7][7];
		//front top
		rt[1][2]=3;rt[1][3]=5;rt[1][4]=2;rt[1][5]=4;
		rt[2][1]=4;rt[2][3]=1;rt[2][4]=6;rt[2][6]=3;
		rt[3][1]=2;rt[3][2]=6;rt[3][5]=1;rt[3][6]=5;
		rt[4][1]=5;rt[4][2]=1;rt[4][5]=6;rt[4][6]=2;
		rt[5][1]=3;rt[5][3]=6;rt[5][4]=6;rt[5][6]=4;
		rt[6][2]=4;rt[6][3]=2;rt[6][4]=5;rt[6][5]=3;
		//int[] rf;
		int[][] ft=new int[7][7];
		for(int i=1;i<=6;i++)for(int j=1;j<=6;j++)
			ft[i][j]=rev[i];
		int[][] bt=new int[7][7];
		for(int i=1;i<=6;i++)for(int j=1;j<=6;j++)
			bt[i][j]=i;
		int[][] lt=new int[7][7];
		for(int i=1;i<=6;i++)for(int j=1;j<=6;j++)
			lt[i][j]=rev[rt[i][j]];
		int[][] ff=new int[7][7];
		for(int i=1;i<=6;i++)for(int j=1;j<=6;j++)
			ff[i][j]=j;
		int[][] bf=new int[7][7];
		for(int i=1;i<=6;i++)for(int j=1;j<=6;j++)
			bf[i][j]=rev[j];
		int[][] rf=new int[7][7];
		for(int i=1;i<=6;i++)for(int j=1;j<=6;j++)
			rf[i][j]=i;
		int[][] lf=new int[7][7];
		for(int i=1;i<=6;i++)for(int j=1;j<=6;j++)
			lf[i][j]=i;

		int[][][] df=new int[][][]{rf,bf,lf,ff};
		int[][][] dt=new int[][][]{rt,bt,lt,ft};

		Case:while(true){
			int n=sc.nextInt();
			if(n==0)return;
			int[][] hmap=new int[300][300];
			int[][] map=new int[300][300];

			for(int i=0;i<n;i++){
				int t=sc.nextInt(),f=sc.nextInt();
				int x=150,y=150,h=hmap[150][150];
				while(true){
					//pr(t,f,x,y,h);ln();
					int Mind=-1,nt=-1,nf=-1,nx=-1,ny=-1;
					for(int di=0;di<4;di++){
						int _x=x+dx[di],_y=y+dy[di];
						if(hmap[_y][_x]>=h)continue;
						if(rev[dt[di][f][t]]>Mind && rev[dt[di][f][t]]>=4){
							Mind=rev[dt[di][f][t]];
							nt=dt[di][f][t];
							nf=df[di][f][t];
							nx=_x;ny=_y;
						}
					}
					//落ちれる時落とす
					if(Mind==-1)break;
					t=nt;f=nf;x=nx;y=ny;h=hmap[ny][nx];
				}
				hmap[y][x]=h+1;
				map[y][x]=t;
				//pr(t,f,x,y,h);ln();
			}

			int[] count=new int[6];
			for(int y=0;y<300;y++)for(int x=0;x<300;x++){
				if(map[y][x]>=1)count[map[y][x]-1]++;
			}
			ln(str(count));
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}

	static Scanner sc=new Scanner(in);
	//output lib
	static final String br=System.getProperty("line.separator");
	static final String[] asep=new String[]{""," ",br,br+br};
	static String str(boolean o){
		return o?"YES":"NO";
	}
	static <K,V> String str(Map<K, V> map){
		StringBuilder sb=new StringBuilder();
		boolean isFirst=true;
		for(Entry<K,V> set:map.entrySet()){
			if(!isFirst)sb.append(br);
			sb.append(str(set.getKey())).append(":").append(str(set.getValue()));
			isFirst=false;
		}
		return sb.toString();
	}
	static <E> String str(Collection<E> list){
		StringBuilder sb=new StringBuilder();
		boolean isFirst=true;
		for(E e:list){
			if(!isFirst)sb.append(" ");
			sb.append(str(e));
			isFirst=false;
		}
		return sb.toString();
	}
	static String str(Object o){
		int depth=_getArrayDepth(o);
		if(depth>0)return _strArray(o,depth);
		return o.toString();
	}
	static int _getArrayDepth(Object o){
		if(!o.getClass().isArray() || Array.getLength(o)==0) return 0;
		return 	1+_getArrayDepth(Array.get(o,0));
	}
	//depth ex A[10]…1 A[10][10]…2 exception A[0]…0 A[10][0]…1 A[0][0]…0
	static String _strArray(Object o,int depth){
		if(depth==0) return str(o);
		StringBuilder sb=new StringBuilder();
		for(int i=0,len=Array.getLength(o);i<len;i++){
			if(i!=0)sb.append(asep[depth]);
			sb.append(_strArray(Array.get(o,i),depth-1));
		}
		return sb.toString();
	}
	static void pr(Object... os){
		boolean isFirst=true;
		for(Object o:os){
			if(!isFirst)out.print(" ");
			out.print(o);
			isFirst=false;
		}
	}
	static void ln(){
		out.println();
	}
	static void ln(Object... os){
		for(Object o:os){
			pr(o);ln();
		}
	}
}