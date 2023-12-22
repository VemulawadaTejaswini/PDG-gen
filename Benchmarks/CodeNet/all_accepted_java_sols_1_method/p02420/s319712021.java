import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true)  {
			String cards = scanner.next();
			if(cards.equals("-")) {
				break;
			}
			int m = scanner.nextInt();
			char hands[] = new char[cards.length() + 1];
			char oki;
			for (int i = 0; i < cards.length(); i++) {
				hands[i] = cards.charAt(i);
			}
			for (int k = 0; k < m; k++) {
				int shuffle = scanner.nextInt();
				for (int j = 0; j < shuffle; j++) {
					for (int i = 0; i < cards.length() - 1; i++) {
						oki = hands[i];
						while (i < cards.length() - 1) {
							hands[i] = hands[i + 1];
							i++;
						}
						hands[cards.length() - 1] = oki;

					}
				}
			}
			for (int i = 0; i < cards.length(); i++) {
				System.out.print(hands[i]);
			}
			System.out.println();
		}
		scanner.close();
	}
}

