import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static class Vertex implements Comparable <Vertex> {
		int id, ticket;
		double d0;
		Vertex(int vertex, int ticket, double d0){
			this.id = vertex;
			this.ticket=ticket;
			this.d0 = d0;
		}
		public int compareTo(Vertex v) {
			if(this.d0 < v.d0)
				return -1;
			else
				return 1;
		}
	}
	
	static int inf = 100000000;
	public static void main(String args[]){
		try(Scanner sc=new Scanner(System.in)){
			while(sc.hasNext()) {
				int n=sc.nextInt();//馬車券枚数
				int m=sc.nextInt();//町数
				int p=sc.nextInt();//路線数
				int s=sc.nextInt();//出発地
				int e=sc.nextInt();//目的地
				if(n==0) break;
				double[] horse=new double[n+1];//馬車券に指定された頭数
				double[][] f=new double[m+1][m+1];//距離
				double[][] t=new double[m+1][1<<n];//頂点と使った割引券
				
				for(int i=0; i<n; i++) {
					horse[i]=sc.nextDouble();
				}
				for(int i=0; i<p; i++) {
					int a=sc.nextInt();
					int b=sc.nextInt();
					f[a][b]=f[b][a]=sc.nextDouble();
				}
				
				for(int i=1; i<=m; i++) {
					for(int j=0; j<(1<<n); j++) {
						t[i][j]=inf;
					}
				}
				t[s][0]=0;
				PriorityQueue<Vertex> pq=new PriorityQueue<Vertex>();
				pq.add(new Vertex(s, 0, 0));//頂点、チケット、所要時間
				
				Map<Integer, Double> prev=new HashMap<>();
				prev.put(s, 0.0);//頂点、所要時間
				
				while(!pq.isEmpty()) {
					Vertex u=pq.remove();
					if(prev.containsKey(u.id)) {
						double keymin=Math.min(prev.get(u.id), u.d0);
						prev.remove(u.id);
						prev.put(u.id, keymin);
					}
					else {
						prev.put(u.id, u.d0);
					}
					
					for(int i=1; i<=m; i++) {
						if(f[u.id][i]>0) {
							for(int k=0; k<n; k++) {
								if((1&u.ticket>>k)==1) {
									continue;
								}
								int nexti=u.ticket|(1<<k);
								
//								for(int j=0; j<n; j++) {
//									if((1&u.ticket>>j)==1)
//										System.out.print(1);
//									else
//										System.out.print(0);
//								}
//								System.out.print(" ");
//								for(int j=0; j<n; j++) {
//									if((1&nexti>>j)==1)
//										System.out.print(1);
//									else
//										System.out.print(0);
//								}
//								System.out.print(" ");
//								
								double alt=u.d0+f[u.id][i]/horse[k];
//								System.out.println("u.d0="+u.d0+"new="+(alt-u.d0));
//								System.out.println("now="+u.id+" i="+i+" "+alt);
								if(t[i][nexti]>alt) {
									t[i][nexti]=alt;
									pq.add(new Vertex(i, nexti, alt));
								}
							}
						}
					}
				}

				System.out.println((prev.get(e)==null)? "Impossible" : prev.get(e));
				
			}
		}
	}
} 
