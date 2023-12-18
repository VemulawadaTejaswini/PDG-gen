import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	static class Bill implements Comparable<Bill> {
		int p, v;
		double dis;
		Bill(int p,int v, double dis){
			this.p=p;
			this.v=v;
			this.dis=dis;
		}
		public int compareTo(Bill b) {
			if(this.dis-b.dis>0) {
				return 1;
			}
			return -1;
		}
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int n=sc.nextInt();
				if(n==0) break;
				int b;
				double INF=1<<29;
				int[] x=new int[n+1];
				int[] y=new int[n+1];
				for(int i=0; i<n; i++) {
					b=sc.nextInt();
					x[b]=sc.nextInt();
					y[b]=sc.nextInt();
				}
				int m=sc.nextInt();
				int s, g;
				PriorityQueue<Bill> pq=new PriorityQueue<>();
				ArrayList<Integer> list=new ArrayList<>();
				while(m-->0) {
					s=sc.nextInt();
					g=sc.nextInt();
					pq.add(new Bill(0, s, 0.0));
					double [] cost=new double[n+1];
					int[] pre=new int[n+1];
					Arrays.fill(cost, INF);
					while(!pq.isEmpty()) {
						Bill bill=pq.poll();
						int now=bill.v;
						double d=bill.dis;
						if(cost[now]<d) continue;
						cost[now]=d;
						pre[now]=bill.p;
						if(now==g) 	break;
						
						for(int i=1; i<=n; i++) {
							if(i==now) continue;
							double r=Math.sqrt((x[now]-x[i])*(x[now]-x[i])+(y[now]-y[i])*(y[now]-y[i]));
							//System.out.println(now+" "+i+" "+r);
							if(r>50) continue;
							if(cost[i]>d+r) {
								pq.add(new Bill(now, i, d+r));
							}
						}
					}
					if(cost[g]==INF) System.out.println("NA");
					else {
						for(int i=g;;i=pre[i]) {
							list.add(i);
							if(i==s) break;
						}
						for(int i=list.size()-1;i>=0; i--) {
							if(i!=list.size()-1) System.out.print(" ");
							System.out.print(list.get(i));
						}
						System.out.println();
					}
					pq.clear();
					list.clear();
				}
				
			}

		}
	}
}
