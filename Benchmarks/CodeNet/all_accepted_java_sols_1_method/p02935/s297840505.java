import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] v = new double[n];
		for (int i = 0; i < n; i++) {
			v[i] = sc.nextDouble();
		}
		sc.close();

		Arrays.sort(v);

		double vAve = (v[0] + v[1]) / 2;
		double tmp = 0;

		for (int i = 2; i < n; i++) {
			tmp = vAve;
			vAve = (tmp + v[i]) / 2;
		}

		System.out.println(vAve);

	}

}
