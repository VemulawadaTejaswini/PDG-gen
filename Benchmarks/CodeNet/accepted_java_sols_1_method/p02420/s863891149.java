import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder out = new StringBuilder();
		while (true) {
			String cards = (String)sc.next();
			if (cards.equals("-"))
				break;
			int m = sc.nextInt();
			for (int i = 0; i < m; ++i) {
				int h = sc.nextInt();
				cards =	cards.substring(h) + cards.substring(0, h); 
			}
			out.append(cards + "\n");
		}
		System.out.print(out);
	}
}
