import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt();
		int M = sc.nextInt();

		int H_degree = 30*H;
		int M_degree = 6*M;
		double radian = Math.PI * 2 * (H / 12.0 + (M / 60.0)/12.0 - M / 60.0);
		double cos = Math.cos(radian);
		double ans = Math.pow(A, 2) + Math.pow(B, 2) -(2 * A * B * cos);
		System.out.println(Math.sqrt(ans));

	}
}