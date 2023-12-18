import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {
			boolean[] check = new boolean[11];
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			check[a] = check[b] = check[c] = true;
			double sum = .0;
			for (int i = 1; i < check.length; i++) {
				if (!check[i]) sum += (a + b + i) <= 20 ? 0.142857 : 0;
			}
			System.out.println(sum >= .5 ? "YES" : "NO");
		}

	}

}