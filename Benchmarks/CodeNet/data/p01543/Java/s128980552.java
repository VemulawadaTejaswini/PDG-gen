import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	int n;
	int[][] w, e;
	int[][] a;

	void run(){
		n=sc.nextInt();
		w=new int[n][n];
		e=new int[n][n];
		a=new int[n][n];
		for(int j=0; j<n; j++){
			for(int i=0; i<n; i++){
				w[j][i]=sc.nextInt();
			}
		}
		for(int j=0; j<n; j++){
			for(int i=0; i<n; i++){
				e[j][i]=sc.nextInt();
			}
		}
		for(int j=0; j<n; j++){
			String s=sc.next();
			for(int i=0; i<n; i++){
				a[j][i]=s.charAt(i)=='o'?1:0;
			}
		}
		solve();
	}

	void solve(){
		V s=new V(-1), t=new V(-1);
		V[] us=new V[n]; // x
		V[] vs=new V[n]; // y
		for(int i=0; i<n; i++){
			us[i]=new V(i);
			vs[i]=new V(i);
		}
		// とりあえずぜんぶけす
		int erase=0;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(a[j][i]==1){
					erase+=e[j][i];
					w[j][i]=-e[j][i];
				}
			}
		}
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				us[i].add(vs[j], 1, w[j][i]);
			}
			// s->us
			s.add(us[i], 1, 0);
			vs[i].add(t, 1, 0);
		}
		for(int j=0; j<n; j++){
			for(int i=0; i<n; i++){
//				debug(i, j, us[i].es.size());
			}
		}
		ArrayList<V> list=new ArrayList<V>();
		list.add(s);
		list.add(t);
		list.addAll(asList(us));
		list.addAll(asList(vs));
//		debug("erase", erase);
		int mcf=minCostFlow(list.toArray(new V[0]), s, t, n);
		int[][]b=new int[n][n];
		for(int i=0; i<n; i++){
			// us[i]
			for(E e : us[i].es){
				if(e.cap==0){
					// 書いた
					b[e.to.id][i]=1;
				}
			}
		}
		StringBuilder sb=new StringBuilder();
		int count=0;
		for(int j=0;j<n;j++){
			for(int i=0;i<n;i++){
				if(a[j][i]==0&&b[j][i]==1){
					sb.append(j+1);
					sb.append(' ');
					sb.append(i+1);
					sb.append(" write\n");
					count++;
				}
				if(a[j][i]==1&&b[j][i]==0){
					sb.append(j+1);
					sb.append(' ');
					sb.append(i+1);
					sb.append(" erase\n");
					count++;
				}
			}
		}
		for(int i=0;i<n;i++){
//			debug(i,b[i]);
		}
		println((erase+mcf)+"");
		println(count+"");
		print(sb.toString());
	}

	int minCostFlow(V[] vs, V s, V t, int flow){
		int res=0;
		while(flow>0){
			for(V v : vs)
				v.min=INF;
			PriorityQueue<E> que=new PriorityQueue<E>();
			s.min=0;
			que.offer(new E(s, 0, 0));
			while(!que.isEmpty()){
				E crt=que.poll();
				if(crt.cost==crt.to.min){
					for(E e : crt.to.es){
						int tmp=crt.cost+e.cost+crt.to.h-e.to.h;
						if(e.cap>0&&e.to.min>tmp){
							e.to.min=tmp;
							e.to.prev=e;
							que.offer(new E(e.to, 0, e.to.min));
						}
					}
				}
			}
			if(t.min==INF)
				return -1;
			int d=flow;
			for(E e=t.prev; e!=null; e=e.rev.to.prev){
				d=min(d, e.cap);
			}
			for(E e=t.prev; e!=null; e=e.rev.to.prev){
				res+=d*e.cost;
				e.cap-=d;
				e.rev.cap+=d;
			}
			flow-=d;
			for(V v : vs)
				v.h+=v.min;
		}
		return res;
	}

	class V{
		ArrayList<E> es=new ArrayList<E>();
		E prev;
		int min, h;
		int id;

		V(int id){
			this.id=id;
		}

		void add(V to, int cap, int cost){
			E e=new E(to, cap, cost), rev=new E(this, 0, -cost);
			e.rev=rev;
			rev.rev=e;
			es.add(e);
			to.es.add(rev);
		}
	}

	class E implements Comparable<E>{
		V to;
		E rev;
		int cap, cost;

		E(V to, int cap, int cost){
			this.to=to;
			this.cap=cap;
			this.cost=cost;
		}

		public int compareTo(E o){
			return cost-o.cost;
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
		new Main().run();
	}
}