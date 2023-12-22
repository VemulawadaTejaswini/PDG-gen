import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N;
	static int T;


	public static void main(String[] args) {
		N = sc.nextInt();
		T = sc.nextInt();

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			int c = sc.nextInt();
			int t = sc.nextInt();

			if (t <= T) {
				min = Math.min(min, c);
			}
		}

		System.out.println(min == Integer.MAX_VALUE ? "TLE" : min);
	}

}