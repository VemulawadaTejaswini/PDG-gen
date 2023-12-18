import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int T = sc.nextInt();
		double max = 0;
		for (int i = 0; i < T; ++i) {
			max = Math.max(max, calc());
		}
		System.out.println(max > calc() + 0.0000001 ? "YES" : "NO");
	}

	static double calc() {
		int N = sc.nextInt();
		int M = sc.nextInt();
		double sum = 0;
		double sumR = 0;
		for (int i = 0; i < M; ++i) {
			int V = sc.nextInt();
			double R = sc.nextDouble();
			sum += V * R;
			sumR += R;
		}
		return sum / sumR;
	}

}