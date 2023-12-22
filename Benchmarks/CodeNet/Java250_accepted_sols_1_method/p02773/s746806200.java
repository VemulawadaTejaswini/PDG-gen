import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S[] = new String[N];

		for (int i = 0; i < N; i++) {
			S[i] = sc.next();
		}

		Arrays.sort(S);

		int max = 1;

		int b[] = new int[N];
		for(int i=0; i<N; i++) {
			b[i]=1;
		}

		for (int i = 1; i < N; i++) {
			if (S[i].equals(S[i - 1])) {
				b[i] = b[i - 1] + 1;
				if (b[i] > max) {
					max = b[i];
				}
			}
		}

		for (int i = 0; i < N; i++) {
			if (b[i] == max) {
				System.out.println(S[i]);
			}
		}
		sc.close();
	}
}
