import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt() - 1;
		int Y = sc.nextInt() - 1;

		ArrayList<ArrayList<Integer>> vertexes = new ArrayList<ArrayList<Integer>>();

		for(int i = 0; i < N; i++){
			ArrayList<Integer> v = new ArrayList<Integer>();
			if(i != 0)v.add(i - 1);
			if(i != N - 1)v.add(i + 1);
			vertexes.add(v);
		}
		vertexes.get(X).add(Y);
		vertexes.get(Y).add(X);

		int dis[] = new int[N];
		Arrays.fill(dis, 0);

		for(int n = 0; n < N; n++){
			//BFS
			boolean[] seen = new boolean[N];
			Arrays.fill(seen, false);
			int count = 0;

			Queue<Integer> queue = new ArrayDeque<Integer>();
			queue.add(n);
			seen[n] = true;
			while(!queue.isEmpty()){
				int size = queue.size();
				for(int j = 0; j < size; j++){
					int x = queue.poll();
					ArrayList<Integer> v = vertexes.get(x);
					for(int i = 0; i < v.size(); i++){
						int y = v.get(i);
						if(!seen[y]){
							queue.add(y);
							seen[y] = true;
							dis[count]++;
						}
					}
				}
				count++;
			}
		}

		for(int i = 0;i < N-1; i++){
			System.out.println(dis[i]/2);
		}
	}
}