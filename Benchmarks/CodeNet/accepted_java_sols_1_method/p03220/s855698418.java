import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int A = sc.nextInt();
		int H = 0;
		double maxTemperature = Double.MAX_VALUE;
		int answer = 0;

		for (int i = 0 ; i < N; i++) {
			H = sc.nextInt();
			if (Math.abs(A - (T - H * 0.006)) < maxTemperature) {
				maxTemperature = Math.abs(A - (T - H * 0.006));
				answer = i + 1;
			}
		}

		System.out.println(answer);
	}
}
