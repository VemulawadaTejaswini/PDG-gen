import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int h[] = new int[N];
		for(int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
		}
		
		Arrays.sort(h);
		int min = 0;
		int max = 0;
		int sum = 0;
		min = h[0];
		max = h[K - 1];
		int dist = max - min;
		int mindist = dist;
		
		for(int i = 0; i < N - K + 1; i++) {
			dist = h[i + K - 1] - h[i];
			mindist = Math.min(dist, mindist);
		}
		
		System.out.println(mindist);
	}
}
