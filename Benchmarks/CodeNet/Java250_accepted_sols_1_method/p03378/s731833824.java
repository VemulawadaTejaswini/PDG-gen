import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), x = sc.nextInt();
		boolean[] a = new boolean[n + 1];
		for (int i = 0; i < m; i++)
			a[sc.nextInt()] = true;

		int cost = 0, min = Integer.MAX_VALUE;
		for (int i = x; i < a.length; i++) {
			if (a[i])
				cost++;
		}
		min = Math.min(cost, min);
		cost = 0;
		for (int i = x; i > 0; i--) {
			if (a[i])
				cost++;
		}
		min = Math.min(cost, min);

		System.out.println(min);
	}

}