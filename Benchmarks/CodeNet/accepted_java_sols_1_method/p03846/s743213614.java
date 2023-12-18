import java.util.Arrays;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] map = new int[N];
		for (int i = 0; i < N; i++) {
			map[i] = sc.nextInt();
		}
		
		Arrays.sort(map);
		
		if (N % 2 == 1) {
			if (map[0] != 0) {
				System.out.println(0);
				return;
			}
			
			int count = 2;
			for (int i = 1; i < N; i++) {
				if (map[i] != count) {
					System.out.println(0);
					return;
				}
				
				if (i % 2 == 0) {
					count += 2;
				}
			}
			
			int ans = 1;
			//後は組み合わせ
			for (int i = 0; i < (N - 1) / 2; i++) {
				ans *= 2;
				ans %= 1_000_000_007;
			}
			
			System.out.println(ans);
		} else {
			int count = 1;
			for (int i = 0; i < N; i++) {
				if (map[i] != count) {
					System.out.println(0);
					return;
				}
				
				if (i % 2 == 1) {
					count += 2;
				}
			}
			
			int ans = 1;
			//後は組み合わせ
			for (int i = 0; i < N / 2; i++) {
				ans *= 2;
				ans %= 1_000_000_007;
			}
			
			System.out.println(ans);
		}
	}
}