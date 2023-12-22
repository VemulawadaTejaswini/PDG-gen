import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S[] = new String[N];

		for (int i = 0; i < N; i ++) {
			S[i] = sc.next();
		}
		Arrays.sort(S);

		int count[] = new int[N];
		Arrays.fill(count, 1);

		int max = 0;
		for (int i = 1; i < N; i++) {
			if (S[i].equals(S[i-1])) {
				count[i] = count[i-1]+1;
			}
			if (max < count[i]) max = count[i];
		}

		for (int i = 0; i < N; i++) {
			if (count[i] == max) {
				System.out.println(S[i]);
			}
		}
	}
}