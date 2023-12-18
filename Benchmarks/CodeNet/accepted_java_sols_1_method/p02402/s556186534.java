import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] x = new int[num];
		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
		}
		long min = 10000000, max = -1000000, sum = 0;

		for (int i = 0; i < x.length; i++) {

			if (min > x[i]) {
				min = x[i];

			}
		}
		for (int i = 0; i < x.length; i++) {
			if (max < x[i]) {
				max = x[i];

			}

		}
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println(min + " " + max + " " + sum);
		sc.close();
	}
}

