import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] r = new int[n];
		for (int t = 0; t < n; t++) {
			r[t] = sc.nextInt();
		}

		int max = 0, min = Integer.MAX_VALUE;

		int minTime = -1;
		for (int i = 0; i < n - 1; i++) {
			if (min >= r[i]) {
				min = r[i];
				minTime = i;
			}
		}
		for (int i = minTime + 1; i < n; i++) {
			max = Math.max(max, r[i]);
		}
		System.out.println(max - min);

	}

}

