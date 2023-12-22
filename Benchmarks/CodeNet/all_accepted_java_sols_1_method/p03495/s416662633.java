import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] input = new int[N + 1];
		for (int i = 0; i < N; i++) {
			int tmp = sc.nextInt();
			input[tmp] += 1;
		}
		int kinds = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] == 0) {
				input[i] = 200001;
			} else {
				kinds++;
			}
		}
		Arrays.sort(input);
		int res = 0;
		for (int i = 0; i < kinds - K; i++) {
			res += input[i];
		}
		System.out.print(res);
	}
}
