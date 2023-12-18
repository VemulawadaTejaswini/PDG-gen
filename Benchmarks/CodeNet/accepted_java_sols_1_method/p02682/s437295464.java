import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String line1 = scanner.nextLine();
		scanner.close();
		String[] linestr =line1.split(" ",0);
		long cards = Long.parseLong(linestr[3]);
		long ans = 0;
		long[] cardsArr = new long[3];
		long[] ansArr = new long[3];
		
		for (int i = 0; i < 3; i++) {
			cardsArr[i] += Long.parseLong(linestr[i]);
		}

		for (int i = 0; i < 3; i++) {
			if (cards - cardsArr[i] >= 0) {
				cards = cards - cardsArr[i];
				ansArr[i] = cardsArr[i];
			} else {
				ansArr[i] = cards;
				break;
			}
		}
		ans = ansArr[0] * 1 + ansArr[1] * 0 + ansArr[2] * -1;
		System.out.println(ans);

	}
}
