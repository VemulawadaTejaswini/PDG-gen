import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = sc.nextInt();
		int[] input = new int[N];
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		Arrays.sort(input);
		for (int i = 0; i < input.length; i++) {
			if (x > input[i]) {
				if (i == N - 1) {
					System.out.println(i);
					System.exit(0);
				}
				x -= input[i];
				continue;
			}
			if (x == input[i]) {
				System.out.println(i + 1);
				break;
			}
			if (x < input[i]) {
				System.out.println(i);
				break;
			}
		}
	}
}
