import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		N = sc.nextInt();
		long ans = 1;
		for (int i = 1; i <= N; i++) {
			ans = (i * ans) % (1000000000 + 7);
		}

		System.out.print(ans);
	}
}