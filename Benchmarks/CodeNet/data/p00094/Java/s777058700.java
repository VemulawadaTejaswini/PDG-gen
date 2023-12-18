import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(" ");

		int[] x = new int[2];

		for (int i = 0; i < 2; i++) {
			x[i] = sc.nextInt();
		}

        sc.close();
		double ans = (x[0] * x[1]) / 3.305785;

		System.out.println(ans);
	}

}