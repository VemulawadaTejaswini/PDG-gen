import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] map = new int[N];
		for (int i = 0; i < N; i++) {
			map[i] = sc.nextInt();
		}
		
		int ans = 1;
		int max = map[0];
		for (int i = 1; i < N; i++) {
			if (max <= map[i]) {
				ans++;
			}
			
			max = Math.max(max, map[i]);
		}
		
		System.out.println(ans);
	}
}
