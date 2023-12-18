import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] x = new int[n];
		int sum = 0;

		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			sum += Math.min(Math.abs(x[i] - 0), Math.abs(x[i] - k)) * 2;
		}

		System.out.println(sum);
	}
}