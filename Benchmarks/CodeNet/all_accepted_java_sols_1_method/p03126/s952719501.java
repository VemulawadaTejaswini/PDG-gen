
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int food = sc.nextInt();

		int[][] like = new int[n][];
		for (int i = 0; i < n; i++) {
			int[] like2 = new int[sc.nextInt()];
			for (int j = 0; j < like2.length; j++) {
				like2[j] = sc.nextInt();
			}
			like[i] = like2;
		}

		int[] cnt = new int[food];

		for (int j = 0; j < like.length; j++) {
			for (int k = 0; k < like[j].length; k++) {
				cnt[like[j][k] - 1]++;
			}
		}
		
		int ans = 0;
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] == n) {
				ans++;
			}
		}

		System.out.println(ans);

	}
}