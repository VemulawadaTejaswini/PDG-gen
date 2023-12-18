
import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;


import static java.lang.Math.*;
import static java.lang.System.*;

class Main {
	public static Random rand=new Random();

	public int[] dx=new int[]{1,0,-1,0};
	public int[] dy=new int[]{0,1,0,-1};

	public void dfs(int y,int x,int d){
		//次の点に行く
		for(int i=0;i<4;i++){
			int _x=x+dx[i],_y=y+dy[i];
			if(!(0<=_x && _x <W && 0<=_y && _y<H))continue;
			int c=dp[y][x][d]+(map[y][x]==(i-d+4)%4?0:cost[(i-d+4)%4]);
			if(dp[_y][_x][i]>c){
				dp[_y][_x][i]=c;
				dfs(_y,_x,i);
			}
		}
	}

	int W,H;int[][] map;int[]  cost;
	int[][][] dp;
	public void run() {
		Case:while(true){
			W=sc.nextInt();H=sc.nextInt();
			if(W==0 && H==0)return;
			map=new int[H][W];
			for(int h=0;h<H;h++)for(int w=0;w<W;w++){
				map[h][w]=sc.nextInt();
			}

			cost=new int[4];
			for(int i=0;i<4;i++)
				cost[i]=sc.nextInt();

			dp=new int[H][W][4];//上下左右どこから来たか
			for(int h=0;h<H;h++)for(int w=0;w<W;w++){
				Arrays.fill(dp[h][w],100000000);
			}
			dp[0][0][0]=0;
			dfs(0,0,0);

			int m=Integer.MAX_VALUE;
			for(int i=0;i<4;i++)m=min(dp[H-1][W-1][i],m);
			ln(m);
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