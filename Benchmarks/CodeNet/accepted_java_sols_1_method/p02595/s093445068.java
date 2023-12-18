import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int ans = 0;

		for (int i = 0; i < N; i++) {
			double let = Math.sqrt(Math.pow(sc.nextInt(), 2) + Math.pow(sc.nextInt(), 2));
			if (let <= D ) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}