import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		final int m = sc.nextInt();

		int[][] adj = new int[n][n];

		for (int i = 0; i < m; i++) {
			final int a = sc.nextInt();
			final int b = sc.nextInt();
			final int c = sc.nextInt();

			adj[a][b] = c;
		}
		
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		int[] times = new int[n];
		Arrays.fill(times, Integer.MIN_VALUE);
		times[0] = 0;
		
		queue.add(0);
		
		while(!queue.isEmpty()){
			int pos = queue.poll();
			
			for(int to = 0; to < n; to++){
				if(adj[pos][to] > 0){
					if(times[to] < times[pos] + adj[pos][to]){
						times[to] = times[pos] + adj[pos][to];
						queue.add(to);
					}
				}
			}
		}
		
		System.out.println(times[n-1]);

		sc.close();
	}

}