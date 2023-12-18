import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N % 2 == 0) {
			int ans = 0;
			for(int i = 1; i < N; i++) {
				ans += i;
			}
			System.out.println(ans - N / 2);
			for(int i = 1; i <= N; i++) {
				for(int j = i + 1; j <= N; j++) {
					if(i + j == N + 1) continue;
					System.out.print(i + " ");
					System.out.println(j);
				}
			}
		} else {
			int ans = 0;
			for(int i = 1; i < N; i++) {
				ans += i;
			}
			System.out.println(ans - (N - 1) / 2);
			for(int i = 1; i <= N; i++) {
				for(int j = i + 1; j <= N; j++) {
					if(i + j == N) continue;
					System.out.print(i + " ");
					System.out.println(j);
				}
			}
		}
	}
}
