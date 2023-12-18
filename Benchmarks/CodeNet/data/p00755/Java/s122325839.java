
import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;

import static java.lang.System.*;
import static java.lang.Math.*;

class Main {
	public static Random rand=new Random();

	static boolean hasNext(int[] r,int[] a){
		for(int i=r.length-1;i>=0;i--){
			if(a[i]+1<r[i])return true;
		}
		return false;
	}
	static boolean next(int[] r,int[] a){
		for(int i=r.length-1;i>=0;i--){
			if(a[i]+1<r[i]){
				a[i]++;return true;
			}else{
				a[i]=0;
			}
		}
		return false;
	}

	class P{
		int x,y;
		P(int _y,int _x){
			x=_x;y=_y;
		}
	}

	final int[] dx=new int[]{1,0,-1,0},dy=new int[]{0,1,0,-1};

	public void run() {
		Case:while(true){
			int H=sc.nextInt(),W=sc.nextInt(),C=sc.nextInt()-1;
			if(H==0 && W==0)return;
			int[][] map=new int[H][W];
			for(int h=0;h<H;h++)for(int w=0;w<W;w++)
				map[h][w]=sc.nextInt()-1;

			P[][] pmap=new P[H][W];
			for(int h=0;h<H;h++)for(int w=0;w<W;w++)pmap[h][w]=new P(h,w);

			int M=0;
			for(int[] is=new int[5],R=new int[]{6,6,6,6,6};hasNext(R,is);next(R,is)){
				if(is[4]!=C)continue;
				boolean[][] passed=new boolean[H][W];

				Queue<P> que=new LinkedList<P>();
				passed[0][0]=true;
				int c=map[0][0];
				for(int i=0;i<6;i++){
					//キューに突っ込む
					for(int h=0;h<H;h++)for(int w=0;w<W;w++){
						if(passed[h][w])que.add(pmap[h][w]);
					}
					Queue<P> tmp=new LinkedList<P>();
					while(!que.isEmpty()){
						P p=que.poll();
						for(int di=0;di<4;di++){
							int x=p.x+dx[di],y=p.y+dy[di];
							if(0<=x && x< W && 0<=y && y<H){
								if(map[y][x]==c && !passed[y][x]){
									que.add(pmap[y][x]);
									passed[y][x]=true;
								}
							}
						}
					}
					if(i+1==6)break;

					//next
					que=tmp;
					//color change
					c=is[i];
				}

				int co=0;
				for(int h=0;h<H;h++)for(int w=0;w<W;w++){
					if(passed[h][w])co++;
				}
				M=max(co,M);
			}
			ln(M);
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
	// from this
//		static BufferedReader in;
//		static PrintWriter out;
//		static {
//	    	try {
//				in =new BufferedReader(new FileReader("file.in")); Project/file.in
//				out=new PrintWriter(new BufferedWriter(new FileWriter("file.out")));
//	    	} catch (IOException e) {
//				e.printStackTrace();
//			}
	//  }
	// end

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