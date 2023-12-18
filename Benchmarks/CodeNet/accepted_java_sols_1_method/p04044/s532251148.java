import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		String[] input = new String[N];
		for (int i = 0; i < N; i++) {
			input[i] = sc.next();
		}
		Arrays.sort(input);
		for (int i = 0; i < N; i++) {
			System.out.print(input[i]);
		}
	}
}