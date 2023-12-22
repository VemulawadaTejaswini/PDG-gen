import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int T = sc.nextInt();
		int A = sc.nextInt();
		double ave = Double.MAX_VALUE;
		double temp;
		int n = 0;
		for (int i = 1; i <= N; i++) {
			temp = Math.abs(T - sc.nextInt() * 0.006 - A);
			if (temp < ave) {
				ave = temp;
				n = i;
			}
		}
		// 出力
		System.out.println(n);
	}
}