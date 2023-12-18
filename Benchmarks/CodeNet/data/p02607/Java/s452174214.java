import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int res = 0;
		for (int i = 1; i <= N; i++) {
			int tmp = sc.nextInt();
			if (i % 2 == 1 && tmp % 2 == 1) {
				res++;
			}

		}
		System.out.println(res);
	}
}