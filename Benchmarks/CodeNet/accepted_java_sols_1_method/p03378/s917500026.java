import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), x = sc.nextInt();
		boolean[] a = new boolean[n + 1];
		for (int i = 0; i < m; i++)
			a[sc.nextInt()] = true;

		int cost1 = 0, cost2 = 0;
		for (int i = x; i < a.length; i++) {
			if (a[i])
				cost1++;
		}
		for (int i = x; i > 0; i--) {
			if (a[i])
				cost2++;
		}

		System.out.println(Math.min(cost1, cost2));
	}

}