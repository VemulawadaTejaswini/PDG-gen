import java.util.Arrays;

public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		double N = sc.nextLong();
		double[] a = new double[5];

		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextLong();
		}

		Arrays.sort(a);

		long result = (long)Math.max(Math.ceil(N/a[0]),1) + 4;

		System.out.println(result);
	}
}
