import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		long C[] = new long[27];
		for (int i = 1; i <= 26; i++) {
			C[i] = sc.nextLong();
		}
		long S[][] = new long[D+1][27];
		for (int i = 1; i <= D; i++) {
			for (int j = 1; j <= 26; j++) {
				S[i][j] = sc.nextLong();
			}
		}
		int T[] = new int[D+1];
		for (int i = 1; i <= D; i++) {
			T[i] = sc.nextInt();
		}

		long ans = 0;
		int d[] = new int[27];
		for (int i = 1; i <= D; i++) {
			ans += S[i][T[i]];
			for (int j = 1; j <= 26; j++) {
				if (j == T[i]) {
					d[j] = 0;
				} else {
					ans -= C[j] * ++d[j];
				}
			}
			System.out.println(ans);
		}
	}
}
