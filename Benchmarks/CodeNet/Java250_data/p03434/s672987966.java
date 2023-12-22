import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] cards = new int[N];
		for (int i = 0; i < cards.length; i++) {
			cards[i] = sc.nextInt();
		}
		Arrays.sort(cards);
		int aliceSum = 0;
		int bobSum = 0;
		for (int i = cards.length - 1; i >= 0; i--) {
			if ((cards.length % 2 == 0 && i % 2 != 0) || (cards.length % 2 != 0 && i % 2 == 0)) {
				aliceSum += cards[i];
			} else {
				bobSum += cards[i];
			}
		}
		System.out.println(aliceSum - bobSum);
		sc.close();
	}
}