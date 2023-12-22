import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double T = sc.nextInt();

		double A = sc.nextInt();
		double min = 999999999;
		int ans = 0;

		for (int i = 0; i < N; i++) {
			int H = sc.nextInt();

			double AverageTemperature = T - H * 0.006;

			double difference = Math.abs(A - AverageTemperature);
			if (min > difference) {
				min = difference;
				ans = i + 1;
			}
		}

		System.out.println(ans);
	}

}
