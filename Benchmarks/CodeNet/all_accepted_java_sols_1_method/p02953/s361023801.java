import java.util.Scanner;

public class Main {

	static int n;
	static int[] a = new int[100_000];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.next());
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}

		boolean isStairs = true;
		for (int i = n - 1; i > 1; i--) {
			if (a[i] >= a[i - 1]) {
				continue;
			} else if (a[i] + 1 == a[i - 1]) {
				a[i - 1]--;
			} else {
				isStairs = false;
				break;
			}
		}

		if (n == 1)
			isStairs = true;

		String ans = isStairs ? "Yes" : "No";
		System.out.println(ans);

	}

}
