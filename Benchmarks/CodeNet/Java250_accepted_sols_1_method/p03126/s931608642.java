import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int ans;
		int fod[] = new int[m + 1];
		Arrays.fill(fod, 0);
		int you = 0;

		for (int i = 1; i <= n; i++) {
			you = sc.nextInt();
			for (int s = 1; s <= you; s++) {
				ans = sc.nextInt();
				fod[ans]++;

			}

		}
		
		
		
		int kotae = 0;
		for (int i = 0; i <= m; i++) {
			if (fod[i] == n) {
				kotae++;
			}
		}
		System.out.println(kotae);
	}
}