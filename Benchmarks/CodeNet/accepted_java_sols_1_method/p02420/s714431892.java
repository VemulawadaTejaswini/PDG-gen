import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		for (;;) {
			String deck = sc.next();
			if ("-".equals(deck)) break;
			int m = sc.nextInt();
			for (int i = 0; i < m; i++) {
				int h = sc.nextInt();
				String A = deck.substring(0, h);
				deck = deck.substring(h) + A;
			}
			System.out.println(deck);
		}
	}
}

