import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int numN;
		char ch;

		Scanner sc = null;

		try {
			sc = new Scanner(System.in);

			while (sc.hasNext()) {

				String line = sc.next();
				//?????????????¢????
				if (!line.equals("-")) {
					char[] card = line.toCharArray();

					int numH = sc.nextInt();


					//?????£????????????????????°
					for (int i = 0; i < numH; i++) {

						//?????£?????????????????°
						numN = sc.nextInt();
						for (int j = 0; j < numN; j++) {
							ch = card[0];
							for (int k = 0; k < card.length - 1; k++) {

								card[k] = card[k + 1];
							}
							card[card.length - 1] = ch;
						}
					}

					System.out.println(card);
				}
			}
		}catch (NumberFormatException e) {
			System.out.println(e);
		} finally {
			sc.close();
		}
	}

}