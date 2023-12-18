import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static class Vertex implements Comparable <Vertex> {
		int id, ticket, d0;
		Vertex(int vertex, int ticket, int d0){
			this.id = vertex;
			this.ticket=ticket;
			this.d0 = d0;
		}
		public boolean equals(Object v) {
			return this.id == ((Vertex)v).id;
		}
		public int compareTo(Vertex v) {
			return this.d0 - v.d0;
		}
	}
	
	static int inf = 100000000;
	public static void main(String args[]){
		try(Scanner sc=new Scanner(System.in)){
			while(sc.hasNext()) {
				int c=sc.nextInt();//割引券枚数
				int n=sc.nextInt();//町数
				int m=sc.nextInt();//路線数
				int s=sc.nextInt();//出発地
				int d=sc.nextInt();//目的地
				if(c==0) break;
				int[][] f=new int[n+1][n+1];//料金
				int[][] t=new int[n+1][c+1];//頂点と残っている割引券
				
				for(int i=0; i<m; i++) {
					int a=sc.nextInt();
					int b=sc.nextInt();
					f[a][b]=f[b][a]=sc.nextInt();
				}
				
				for(int i=1; i<=n; i++) {
					for(int j=c; j>=0; j--) {
						t[i][j]=inf;
					}
				}
				t[s][c]=0;
				PriorityQueue<Vertex> pq=new PriorityQueue<Vertex>();
				Vertex[][] vs=new Vertex[n+1][c+1];
//				for(int i=1; i<=n; i++) {
//					for(int j=c; j>=0; j--) {
//						vs[i][j]=new Vertex(i,j, t[i][j]);
//						pq.add(vs[i][j]);
//					}
//				}
				pq.add(new Vertex(s, c, 0));
				
				Map<Integer, Integer> prev=new HashMap<>();
				prev.put(s, 0);
				while(!pq.isEmpty()) {
					Vertex u=pq.remove();
					if(prev.containsKey(u.id)) {
						int keymin=Math.min(prev.get(u.id), u.d0);
						prev.remove(u.id);
						prev.put(u.id, keymin);
					}
					else {
						prev.put(u.id, u.d0);
					}
					for(int i=1; i<=n; i++) {
						if(f[u.id][i]>=1000) {
							int alt=u.d0+f[u.id][i];
							if(t[i][u.ticket]>alt) {
								t[i][u.ticket]=alt;
								pq.add(new Vertex(i, u.ticket, alt));
							}

							if(u.ticket>0 && t[i][u.ticket-1] > alt) {
								t[i][u.ticket-1]=u.d0+f[u.id][i]/2;
								pq.add(new Vertex(i, u.ticket-1, u.d0+f[u.id][i]/2));
							}
						}
					}
				}

				int min=inf;
//				for(int i=c; i>=0; i--){
//					min=Math.min(t[d][i], min);
//				}
//				System.out.println(min);
				System.out.println(prev.get(d));
				
			}
		}
	}
} 
