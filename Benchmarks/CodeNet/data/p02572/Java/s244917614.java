import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] array = new double[N];
		double preTotal = 0;
		int cal = 1000000000;

		int MOD = 1000000007;

		for (int i = 0; i < N; i++) {
			array[i] = sc.nextDouble();
		}

		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				preTotal += array[i] * array[j] / cal;
			}
		}

		double finalTotal = preTotal * cal;
		int finalAns = (int) (finalTotal % MOD);

		System.out.println(finalAns);

	}

}