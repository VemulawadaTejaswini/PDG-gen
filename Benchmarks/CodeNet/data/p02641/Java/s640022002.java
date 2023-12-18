import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		Integer[] input = new Integer[N];
		for (int i = 0; i < N; i++) {
			input[i] = sc.nextInt();
		}
		for (int i = 0; i < 100; i++) {
			if (!Arrays.asList(input).contains(X - i)) {
				System.out.println(X - i);
				System.exit(0);
			}
			if (!Arrays.asList(input).contains(X + i)) {
				System.out.println(X + i);
				System.exit(0);
			}
		}
	}
}