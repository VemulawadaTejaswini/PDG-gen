import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt();
		int M = sc.nextInt();
		double res = 0;

		double kaku = Math.abs(H * 30 + (double) M / 2 - M * 6);
		double rad = Math.toRadians(kaku);
		res = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2) - 2 * A * B * Math.cos(rad));
		System.out.println(res);
	}
}