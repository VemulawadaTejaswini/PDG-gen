import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long ans = 0;
		for (long i = 1; i <= N; i++) {
			if (i * i <= N) {
				ans = i * i;
			}
		}
		sc.close();
		System.out.println(ans);
	}
}
