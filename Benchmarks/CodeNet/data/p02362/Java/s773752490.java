import java.util.Scanner;

public class Main {
	
	static class State {
		int a, b, w;
		public State(int a, int b, int w) {
			this.a = a;
			this.b = b;
			this.w = w;
		}
	}
	
	public static void main(String[] args) throws Exception {
		try(Scanner sc = new Scanner(System.in)) {
			int V = sc.nextInt();
			int E = sc.nextInt();
			int r = sc.nextInt();
			int MAX = 2000001;
			State[] edge = new State[E];
			for(int i=0; i<E; i++) {
				int s = sc.nextInt();
				int t = sc.nextInt();
				int d = sc.nextInt();
				edge[i] = new State(s, t, d);
			}
			int[] dis = new int[V];
			for(int i=0; i<V; i++) {
				dis[i] = MAX;
			}
			dis[r] = 0;
			for(int i=1; ; i++) {
				boolean update = false;
				for(int j=0; j<E; j++) {
					int s = edge[j].a;
					int t = edge[j].b;
					int d = edge[j].w;
					if(dis[t] > dis[s] + d) {
						dis[t] = dis[s]+d;
						update = true;
					}
				}
				if(i == V && update) {
					System.out.println("NEGATIVE CYCLE");
					return;
				}
				else if(! update) {
					break;
				}
			}
			for(int i=0; i<V; i++) {
				if(dis[i] >= MAX) {
					System.out.println("INF");
				}
				else {
					System.out.println(dis[i]);
				}
			}
		}
	}

}


