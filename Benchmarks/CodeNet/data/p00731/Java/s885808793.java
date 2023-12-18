
import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;

import static java.lang.Math.*;
import static java.lang.System.*;

class Main {
	public static Random rand=new Random();

	public int[] dx=new int[]{1,0,-1,0};
	public int[] dy=new int[]{0,1,0,-1};

	class Task implements Comparable<Task>{
		int x,y,lr;
		int cost;
		Task(int _y,int _x,int _lr,int _cost){
			x=_x;y=_y;lr=_lr;cost=_cost;
		}

		@Override
		public boolean equals(Object o) {
			if(!(o instanceof Task))return false;
			Task t=(Task)o;
			return x==t.x && y==t.y && lr==t.lr;
		}
		@Override
		public int compareTo(Task o) {
			return cost-o.cost;
		}
	}


	public void run() {
		Case:while(true){
			int W=sc.nextInt(),H=sc.nextInt();
			if(W==0 && H==0)return;
			char[][] map=new char[H][W];
			for(int h=0;h<H;h++)for(int w=0;w<W;w++){
				map[h][w]=sc.next().charAt(0);
			}

			int[][][] dp=new int[H][W][2];//lr
			for(int h=0;h<H;h++)for(int w=0;w<W;w++){
				Arrays.fill(dp[h][w],100000000);
			}
			//S
			PriorityQueue<Task> que=new PriorityQueue<Task>();
			boolean[][][] used=new boolean[H][W][2];
			for(int h=0;h<H;h++)for(int w=0;w<W;w++){
				if(map[h][w]=='S'){
					dp[h][w][1]=dp[h][w][0]=0;
					que.add(new Task(h,w,0,0));
					que.add(new Task(h,w,1,0));
				}
			}
			while(!que.isEmpty()){
				Task t=que.poll();
				if(used[t.y][t.x][t.lr])continue;
				//次の点に行く
				int nlr=t.lr==0?1:0;
				for(int x=-3;x<=3;x++)for(int y=-3;y<=3;y++){
					if(((t.lr==0 && x>0) ||(t.lr==1 && x<0)) && abs(x)+abs(y)<=3){
						int nx=x+t.x,ny=y+t.y;
						if(!(0<=nx && nx <W && 0<=ny && ny<H))continue;
						switch(map[ny][nx]){
						case 'T':
							ln(t.cost);continue Case;
						case 'X':
							continue;
						default:
							int c=t.cost+(map[ny][nx]-'0');
							if(dp[ny][nx][nlr]>c){
								dp[ny][nx][nlr]=c;
								que.add(new Task(ny,nx,nlr,c));
							}
						}
					}
				}
				used[t.y][t.x][t.lr]=true;
			}
			ln(-1);
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