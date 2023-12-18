
import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;

import static java.lang.Math.*;
import static java.lang.System.*;

class Main {
	public static Random rand=new Random();

	public static int upper_bound(int[] a,int val) {
		int f=0,l=a.length;
		int len=l-f;
		while(len>0){
			int half=len>>1;
			int mid=f+half;
			if(val<a[mid]){
				len=half;
			}else{
				f=mid;
				++f;
				len=len-half-1;
			}
		}
		return f;
	}


	class Link{
		public int to;
		public int c;
		public int cost;
		Link(int _to,int _c,int _cost){
			to=_to;c=_c;cost=_cost;
		}
	}

	class Task implements Comparable<Task>{
		int pos;
		int c;
		int cost;//総計
		int d;//電車変更無しでの移動距離
		Task(int _pos,int _c,int _cost,int _d){
			pos=_pos;c=_c;cost=_cost;d=_d;
		}
		@Override
		public int compareTo(Task o) {
			return cost-o.cost;
		}
	}


	public void run() {

		Case:while(true){
			final int N=sc.nextInt(),M=sc.nextInt(),C=sc.nextInt(),S=sc.nextInt()-1,G=sc.nextInt()-1;
			if(N==0)return;

			PriorityQueue<Task> que=new PriorityQueue<Task>();

			@SuppressWarnings("unchecked")
			List<Link>[] links=new ArrayList[N];
			for(int i=0;i<N;i++)links[i]=new  ArrayList<Link>();

			for(int i=0;i<M;i++){
				int x=sc.nextInt()-1,y=sc.nextInt()-1,d=sc.nextInt(),c=sc.nextInt()-1;
				links[x].add(new Link(y,c,d));
			}

			int[] ps=new int[C];
			for(int i=0;i<C;i++)ps[i]=sc.nextInt();

			int[][] qs=new int[C][];
			int[][] rs=new int[C][];
			for(int i=0;i<C;i++){
				qs[i]=new int[ps[i]];
				for(int j=1;j<=ps[i]-1;j++)qs[i][j]=sc.nextInt();

				rs[i]=new int[ps[i]+1];
				for(int j=1;j<=ps[i];j++)rs[i][j]=sc.nextInt();
			}
			for(int i=0;i<C;i++)que.add(new Task(S,i,0,0));

			boolean[][] passed=new boolean[N][C];

			int m=Integer.MAX_VALUE;
			while(!que.isEmpty()){
				Task task=que.poll();
				//pr(task.c,task.cost,task.d,task.pos);ln();
				passed[task.pos][task.c]=true;
				if(task.pos==G){
					m=min(task.cost,m);
					continue;
				}
				for(Link link:links[task.pos]){
					if(passed[link.to][link.c])continue;
					int d=(task.c==link.c)?(task.d+link.cost):link.cost;
					//コストの計算
					int cost=0;
					if(task.c==link.c){
						{
						int ind=upper_bound(qs[link.c],d)-1;
						for(int i=1;i<=ind;i++){
							cost+=rs[link.c][i]*(qs[link.c][i]-qs[link.c][i-1]);
						}
						cost+=rs[link.c][ind+1]*(d-qs[link.c][ind]);
						}
						{
						int ind=upper_bound(qs[link.c],task.d)-1;
						for(int i=1;i<=ind;i++){
							cost-=rs[link.c][i]*(qs[link.c][i]-qs[link.c][i-1]);
						}
						cost-=rs[link.c][ind+1]*(task.d-qs[link.c][ind]);
						}
					}else{
						{
							int ind=upper_bound(qs[link.c],d)-1;
							for(int i=1;i<=ind;i++){
								cost+=rs[link.c][i]*(qs[link.c][i]-qs[link.c][i-1]);
							}
							cost+=rs[link.c][ind+1]*(d-qs[link.c][ind]);
						}
					}
					Task t=new Task(link.to,link.c,task.cost+cost,d);
					que.add(t);
				}
			}
			ln(m<Integer.MAX_VALUE?m:-1);
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