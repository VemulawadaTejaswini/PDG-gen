import java.util.Scanner;

public class Main {
	
	static class State { // a→bの辺の重さw
		int a, b, w;
		public State(int a, int b, int w) {
			this.a = a;
			this.b = b;
			this.w = w;
		}
	}
	
	public static void main(String[] args) throws Exception {
		try(Scanner sc = new Scanner(System.in)) {
			int V = sc.nextInt(); // 頂点数
			int E = sc.nextInt(); // 辺数
			int r = sc.nextInt(); // 初めの頂点
			int INF = 2000001;    // INF
			State[] edge = new State[E];
			for(int i=0; i<E; i++) {
				int s = sc.nextInt();
				int t = sc.nextInt();
				int d = sc.nextInt();
				edge[i] = new State(s, t, d);
			}
			
			int[] dis = new int[V];
			for(int i=0; i<V; i++) {
				dis[i] = INF;
			}
			dis[r] = 0;
			
			for(int i=1; i<2 ; i++) {
				boolean update = false;
				for(int j=0; j<E; j++) {
					int s = edge[j].a;
					int t = edge[j].b;
					int d = edge[j].w;
					if(dis[s] < INF && dis[t] > dis[s] + d) { // dが負のときdis[s]+d<INFになっておかしくなるから
						dis[t] = dis[s]+d;
						update = true;
					}
				}
				if(i == V && update) { // V-1ステップ後に交換されたら
					System.out.println("NEGATIVE CYCLE");
					return;
				}
				else if(! update) {
					break;
				}
			}
			for(int i=0; i<V; i++) {
				if(dis[i] >= INF) {
					System.out.println("INF");
				}
				else {
					System.out.println(dis[i]);
				}
			}
		}
	}

}


