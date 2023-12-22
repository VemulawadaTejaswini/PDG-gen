import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		int t = 1800 * M + 100 * N;
		int ans = (int)Math.pow(2, M) * t;
		System.out.println(ans);
	}
}