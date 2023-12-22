import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int num = 1;

		for (int i = 1; i <= N; i++) {
			if (i == 1) {
				num *= K;
			} else {
				num *= K-1;
			}
		}
		System.out.println(num);
	}
}
