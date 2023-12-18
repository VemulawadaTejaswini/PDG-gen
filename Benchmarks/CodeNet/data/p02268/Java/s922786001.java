import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int S[] = new int[n];
		int count = 0;
		
		for (int k = 0; k <= n - 1; k++) {
			int x = scanner.nextInt();
			S[k] = x;
		}
		
		int q = scanner.nextInt();
		int T[] = new int[q];
		
		for (int k = 0; k <= q - 1; k++) {
			int x = scanner.nextInt();
			T[k] = x;
		}//SとTを配列にいれる
		
		Arrays.sort(S);
		int mid = (n - 1) / 2;

		for (int i = 0; i <= q - 1; i++) {
			if (T[i] == S[mid]) {
				count += 1;
			} else if (T[i] <= S[mid]) {
				for (int j = 0; j <= mid; j++) {
					if (S[j] == T[i]) {
						count += 1;
						break;
			}
				}
			}else {
				for (int k = mid + 1; k <= n - 1; k++) {
					if (S[k] == T[i]) {
						count += 1;
						break;
				}
			}
		}
				}
		System.out.println (count);
}
}
