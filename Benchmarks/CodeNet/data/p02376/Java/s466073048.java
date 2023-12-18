import java.awt.geom.Point2D;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
//		new A().doIt();
		new GRL_6().doIt();
	}
	class GRL_6{
		void doIt(){
			int n = sc.nextInt();
			int e = sc.nextInt();
			int cost[][] = new int[n][n];
			for(int i = 0;i < e;i++){
				int from = sc.nextInt();
				int to = sc.nextInt();
				int cap = sc.nextInt();
				cost[from][to] = cap;
			}
			MF m = new MF(cost,n,0,n-1);
			System.out.println(m.maxflow());
		}
		class MF{
			int INF=1<<24;
			int n,s,t; //n->node,s->source,t->sink
			int [][] cap, flow;
			int [] levels;
			boolean [] finished;
			MF(int [][] cap, int n, int s, int t){
				this.cap = cap;
				this.n = n; 
				this.s = s; 
				this.t = t;
				flow = new int[n][n];
				finished = new boolean[n];
				levels = new int[n];
			}
			
			private int maxflow() {
				for(int i = 0 ; i < n; i++) Arrays.fill(flow[i], 0);
				int total = 0;
				for(boolean cont = true; cont; ){
					cont = false;
					levelize();
					Arrays.fill(finished, false);
					for(int f; (f = augment(s,INF)) > 0; cont = true)
						total += f;
					}
				return total;
			}
			private void levelize(){
				Arrays.fill(levels, -1);
				LinkedList<Integer> q = new LinkedList<Integer>();
				levels[s] = 0;
				q.add(s);
				while(! q.isEmpty()){
					int here = q.removeFirst();
		            for(int there = 0; there < n; there++){
		            	if(levels[there] < 0 && residue(here, there) > 0){
		            		levels[there] = levels[here] + 1;
		                    q.add(there);
		                }
		            }
				}
			}
			private int augment(int here,int cur){
				if(here == t || cur == 0)return cur;
				if(finished[here])return 0;
				finished[here] = true;
				for(int there = 0;there < n;there++){
					if(levels[there] > levels[here]){
						int f = augment(there, Math.min(cur, residue(here, there)));
						if(f > 0){
							flow[here][there] += f;
							flow[there][here] -= f;
							finished[here] = false;
							return f;
						}
					}
				}
				return 0;
			}
			private int residue(int i, int j) {
				return cap[i][j] - flow[i][j];
			}
		}
	}
	class A{
		BigInteger sum[] = new BigInteger[501];
		BigInteger bit[] = new BigInteger[501];
		void doIt(){
			sum[1] = new BigInteger("1");
			bit[1] = new BigInteger("1");
			for(int i = 2;i < 501;i++){
				bit[i] = bit[i-1].multiply(new BigInteger("2"));
				sum[i] = sum[i-1].add(bit[i]);
			}
			while(true){
				String str = sc.next();
				if(str.equals("0"))break;
				BigInteger num = new BigInteger(str);
				int length = num.toString(2).length() + 1;
				ArrayList<Par> array = new ArrayList<Par>(); 
				array.add(new Par(bit[length],1,length-1));
				System.out.println(bit[length - 1]+" "+sum[length - 1]);
				System.out.println(array.get(0).num+" "+array.get(0).cnt+" "+array.get(0).length);
			}
		}
		class Par{
			BigInteger num;
			int cnt,length;
			public Par(BigInteger num,int cnt,int length){
				this.num = num;
				this.cnt = cnt;
				this.length = length;
			}
		}
	}
}