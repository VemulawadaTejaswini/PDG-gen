import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] input = new int[N];
		for (int i = 0; i < N; i++) {
			int tmp = sc.nextInt();
			input[i] = tmp;
		}
		Arrays.sort(input);
		double res = input[0];
		for (int i = 1; i < N; i++) {
			res = (res + input[i]) / 2;
		}
		System.out.println(res);

	}
}
