import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int res = 0;
		for (int i = 0; i < N; i++) {
			if (K <= sc.nextInt()) {
				res++;
			}
		}
		System.out.println(res);
	}
}
