import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int b[] = new int[N-1];

		for (int i = 0; i < N-1; i++) {
			b[i] = sc.nextInt();
		}

		int ans = 0;
		for (int i = 0; i < N; i++) {
			if (i==0) {
				ans += b[i];
				continue;
			}else if (i==N-1) {
				ans += b[i-1];
				continue;
			}
			ans += Math.min(b[i], b[i-1]);
		}
		System.out.println(ans);
	}
}
