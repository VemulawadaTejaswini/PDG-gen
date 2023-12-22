import java.util.Scanner;

public class Main {

	static int n;
	static int[] S;
	static int q;
	static int[] T;
	static int ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		S = new int[n];
		for (int i = 0; i < n; i++) {
			S[i] = sc.nextInt();
		}
		q = sc.nextInt();
		T = new int[q];
		for (int i = 0; i < q; i++) {
			T[i] = sc.nextInt();
		}
		sc.close();

		ans = 0;
		for (int i = 0; i < q; i++) {
			binarySearch(T[i]);
		}
		System.out.println(ans);
	}

	private static void binarySearch(int num) {
		int left = 0;
		int right = n;

		while (left < right) {
			int mid = (left + right) / 2;
			if (S[mid] == num) {
				ans++;
				return;
			} else if (S[mid] > num) {
				right = mid;
			} else if (S[mid] < num) {
				left = mid + 1;
			}
		}
	}
}