import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-9;

	HashMap<Integer, Integer> map;
	int[] a;
	int w=4, h=2;

	void run(){
		a=new int[w*h];
		init();
		for(; sc.hasNext();){
			for(int i=0; i<w*h; i++){
				a[i]=sc.nextInt();
			}
			println(""+map.get(id(a)));
		}
	}

	void init(){

		LinkedList<S> que=new LinkedList<S>();
		map=new HashMap<Integer, Integer>();

		que.offer(new S(0, 0, new int[]{0, 1, 2, 3, 4, 5, 6, 7}));
		map.put(id(que.peek().a), 0);
		int[] dx={0, 0, -1, 1};
		int[] dy={-1, 1, 0, 0};

		for(; !que.isEmpty();){
			S s=que.poll();
			int p=s.y*w+s.x;
			for(int i=0; i<4; i++){
				int x2=s.x+dx[i];
				int y2=s.y+dy[i];
				int p2=y2*w+x2;
				if(x2>=0&&x2<w&&y2>=0&&y2<h){
					int[] a2=s.a.clone();
					int t=a2[p];
					a2[p]=a2[p2];
					a2[p2]=t;
					S s2=new S(x2, y2, a2);
					if(!map.containsKey(id(s2.a))){
						que.offer(s2);
						map.put(id(s2.a), map.get(id(s.a))+1);
					}
				}
			}
		}
		/*
		 * debug("here");
		 * debug(map.get(1234567));
		 * debug(map.get(10234567));
		 * debug(map.get(76543210));
		 */
	}

	int id(int[] a){
		int res=0;
		for(int e : a){
			res=res*10+e;
		}
		return res;
	}

	/*
	 * void solve(){
	 * int x=-1, y=-1;
	 * for(int i=0; i<w*h; i++){
	 * if(a[i]==0){
	 * x=i%w;
	 * y=i/w;
	 * }
	 * }
	 * 
	 * LinkedList<S> que=new LinkedList<S>();
	 * TreeSet<Integer> set=new TreeSet<Integer>();
	 * 
	 * que.offer(new S(x, y, a, 0));
	 * set.add(que.peek().id);
	 * int[] dx={0, 0, -1, 1};
	 * int[] dy={-1, 1, 0, 0};
	 * 
	 * for(; !que.isEmpty();){
	 * S s=que.poll();
	 * 
	 * if(s.id==1234567){
	 * println(""+s.cnt);
	 * return;
	 * }
	 * 
	 * int p=s.y*w+s.x;
	 * for(int i=0; i<4; i++){
	 * int x2=s.x+dx[i];
	 * int y2=s.y+dy[i];
	 * int p2=y2*w+x2;
	 * if(x2>=0&&x2<w&&y2>=0&&y2<h){
	 * int[] a2=s.a.clone();
	 * int t=a2[p];
	 * a2[p]=a2[p2];
	 * a2[p2]=t;
	 * S s2=new S(x2, y2, a2, s.cnt+1);
	 * if(!set.contains(s2.id)){
	 * que.offer(s2);
	 * set.add(s2.id);
	 * }
	 * }
	 * }
	 * }
	 * }
	 */

	class S{
		int x, y;
		int[] a;

		S(int x, int y, int[] a){
			this.x=x;
			this.y=y;
			this.a=a;
		}
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}