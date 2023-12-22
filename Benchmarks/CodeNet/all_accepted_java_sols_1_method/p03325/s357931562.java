import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] input = new int[N];
		int res = 0;
		for (int i = 0; i < N; i++) {
			input[i] = sc.nextInt();
			while (true) {
				if (input[i] % 2 == 0) {
					input[i] /= 2;
					res++;
				} else {
					break;
				}
			}
		}
		System.out.print(res);
	}
}
