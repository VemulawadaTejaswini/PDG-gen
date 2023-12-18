import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			String cards = scan.next();
			if (cards.equals("-"))
				break;
			int n = scan.nextInt();
			for (int i = 0; i < n; i++) {
				int h = scan.nextInt();
				cards = cards.substring(h, cards.length()).concat(cards.substring(0, h));
			}
			System.out.println(cards);
		}
		scan.close();
		System.exit(0);
	}

}