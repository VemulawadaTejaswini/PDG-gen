import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] v = new double[N];

		for (int i = 0; i < N; i++)
			v[i] = sc.nextDouble();

		Arrays.parallelSort(v);

		double x = (v[0] + v[1]) / 2;
		for (int i = 2; i < N; i++) {
			x = (x + v[i]) / 2;
		}
		System.out.println(x);
	}

}