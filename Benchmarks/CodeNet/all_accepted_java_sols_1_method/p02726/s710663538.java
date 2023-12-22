import java.util.*;
public class Main {
	static long dist[][];
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);		
		int N = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		dist = new long[N][N];
		for(int i = 0; i < N; i++) {
			Arrays.fill(dist[i], Integer.MAX_VALUE);
		}
		
		for(int i = 0; i < N - 1; i++) {
			dist[i][i + 1] = 1;
		}
		dist[X - 1][Y - 1] = 1;
		
		int ans[] = new int[N];
		for(int i = 1; i <= N; i++) {
			for(int j = i + 1; j <= N; j++) {
				ans[(int)Math.min(j - i, Math.abs(j - Y) + Math.abs(X - i) + 1)]++;
			}
		}
		for(int i = 1; i < N; i++) {
			System.out.println(ans[i]);
		}
	}
}
