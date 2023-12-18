import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] bo = new int[n];
			for (int i = 0; i < n; i++) {
				bo[i] = sc.nextInt();
			}
			Arrays.sort(bo);
			int ans = 0;
			for (int i = 0; i < n - 2; i++) {
				for (int j = i + 1; j < n - 1; j++) {
					for (int k = j + 1; k < n; k++) {
						if (bo[i] + bo[j] > bo[k]) {
							ans++;
						} else {
							break;
						}
					}
				}
			}
			System.out.print(ans);
		}
	}
}
