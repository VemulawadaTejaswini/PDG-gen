import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		double[] a = new double[n];
		double result = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextDouble();
			result += 1 / a[i];
		}
		System.out.println(1 / result);
		sc.close();
	}

}
