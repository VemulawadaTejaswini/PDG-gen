import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String S[] = new String[N];
		int result = 1;

		for (int i = 0; i < N; i++) {
			S[i] = scan.next();
		}
		
		Arrays.sort(S);

		for (int i = 0; i < N - 1; i++) {
			if (!(S[i].equals(S[i + 1]))) {
				result++;
			}
		}

		System.out.println(result);

	}

}
