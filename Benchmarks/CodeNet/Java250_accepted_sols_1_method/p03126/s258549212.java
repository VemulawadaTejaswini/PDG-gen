import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		boolean[] map = new boolean[M];
		Arrays.fill(map, true);
		
		for (int i = 0; i < N; i++) {
			int K = sc.nextInt();
			boolean[] check = new boolean[M];
			for (int j = 0; j < K; j++) {
				int index = sc.nextInt();
				check[index-1] = true;
			}
			
			for (int j = 0; j < M; j++) {
				map[j] &= check[j];
			}
		}
		
		int ans = 0;
		for (int i = 0; i < M; i++) {
			if (map[i])
				ans++;
		}
		
		System.out.println(ans);
	}
	
}
