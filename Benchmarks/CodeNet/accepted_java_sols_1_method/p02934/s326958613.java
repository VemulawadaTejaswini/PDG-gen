import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] A = new double[n];

		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}

		double ans = 0;

		for (double a: A) {
			ans += (1/a);
		}

		System.out.println(1/ans);

}}