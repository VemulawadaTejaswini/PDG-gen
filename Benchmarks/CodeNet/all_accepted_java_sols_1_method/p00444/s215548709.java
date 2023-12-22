import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		int v;
		int[] coins = { 500, 100, 50, 10, 5 };
		while ((v = in.nextInt()) != 0) {
			int oturi = 1000 - v;
			int n = 0;
			for (int i = 0; i < 5 && oturi != 0; i++) {
				n += oturi / coins[i];
				oturi %= coins[i];
			}
			n += oturi;
			System.out.println(n);
		}
		in.close();
	}
}