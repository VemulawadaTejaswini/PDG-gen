import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int[] input = new int[M];
		int left = 0;
		int right = 0;
		for (int i = 0; i < input.length; i++) {
			int tmp = sc.nextInt();
			input[i] = tmp;
			if (X < tmp) {
				right++;
			} else {
				left++;
			}
		}
		System.out.println(Math.min(left, right));

	}
}
