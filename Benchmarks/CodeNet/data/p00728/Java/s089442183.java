import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 *AOJテァツ板ィテ」ツδ療」ツδュテ」ツつクテ」ツつァテ」ツつッテ」ツδ?
	 */
	public static void main(String[] args) {
		// TODO ティツ?ェテ・ツ仰陛ァツ板淌ヲツ按静」ツ?陛」ツつ古」ツ?淌」ツδ。テ」ツつステ」ツδε」ツδ嘉」ツδサテ」ツつケテ」ツつソテ」ツδ?
		Scanner scan = new Scanner(System.in);
		int n = 0;
		int sum = 0;
		while (true) {
			n = scan.nextInt();
			int s[] = new int[n];
			for (int i = 0; i < n; i++) {
				s[i] = scan.nextInt();
			}
			Arrays.sort(s);
			for (int i = 1; i < n - 1; i++) {
				sum += s[i];
			}
			System.out.println((int)Math.ceil(sum / (n - 2)));
			if (scan.hasNext() == false) {
				break;
			}
			Arrays.fill(s, 0);
		}

	}

}