import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			n = sc.nextInt();
			int m = sc.nextInt();
			int p = sc.nextInt();
			if(n == 0) break;

			int[][] t = new int[n][n];
			for(int i=0;i<m;i++){
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				t[a][b] = t[b][a] = c;
			}

			PriorityQueue<State> open = new PriorityQueue<State>();
			int[] closed = new int[n];
			Arrays.fill(closed,Integer.MAX_VALUE);
			open.add(new State(0,0,0));

			dag = new boolean[n][n];
			int[] in = new int[n];
			int[] out = new int[n];

			while(!open.isEmpty()){
				State st = open.poll();
				if(st.id != st.before && closed[st.id] >= st.cost){
					dag[st.before][st.id] = true;
					out[st.before]++;
					in[st.id]++;
				}
				if(closed[st.id] != Integer.MAX_VALUE) continue;
				closed[st.id] = st.cost;

				if(st.id == n-1) continue;
				for(int i=0;i<n;i++){
					if(t[st.id][i] > 0){
						open.add(new State(i,st.id,st.cost+t[st.id][i]));
					}
				}
			}

			dp = new double[n];
			Arrays.fill(dp,-1);

			double route = countRoute(0);
			for(int i=0;i<p;i++){
				int id = sc.nextInt();
				System.out.printf("%.8f\n",in[id]*out[id]/route);
			}
			System.out.println();
		}
	}

	static int n;
	static boolean[][] dag;
	static double[] dp;

	static double countRoute(int id){
		if(id == n-1) return 1;
		if(dp[id] != -1) return dp[id];
		double res = 0.0;

		for(int i=0;i<n;i++){
			if(dag[id][i]) {
				res += countRoute(i);
			}
		}
		return dp[id] = res;
	}
}

class State implements Comparable<State>{
	int id,before,cost;

	State(int id,int before,int cost){
		this.id = id;
		this.before = before;
		this.cost = cost;
	}

	public int compareTo(State st){
		return cost - st.cost;
	}
}