import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(System.in);
//		Scanner sc = new Scanner(
//				new BufferedReader(
//						new FileReader("/workspace/AOJ/src/section1/sample2.txt")));

		int n = sc.nextInt();
		int[] r = new int[n];
		for (int t = 0; t < n; t++) {
			r[t] = sc.nextInt();
		}

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int ans1 = Integer.MIN_VALUE;
		int ans2 = Integer.MIN_VALUE;

		// 最大値 -> 最小値
		for (int i = 1; i < n; i++) {
			if (max < r[i]) {
				max = r[i];
				int[] r2 = r.clone();
				Arrays.sort(r2, 0, i-1);
				ans1 = Math.max(ans1, max - r2[0]);
			}
		}

		// 最小値 -> 最大値
		for (int i = 0; i < n-1; i++) {
			if (min > r[i]) {
				min = r[i];
				int[] r2 = r.clone();
				Arrays.sort(r2, i+1, r2.length);
				ans2 = Math.max(ans2, r2[r2.length-1] - min);
			}
		}

		System.out.println(Math.min(ans1, ans2));

	}
}

