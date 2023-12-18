import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str[];
		int card[];
		boolean op,tp,tc,fh,fc,st;

		card = new int[5];
		while (sc.hasNext()) {
			op = false;
			tp = false;
			tc = false;
			fh = false;
			fc = false;
			st = false;
			str = sc.next().split(",");
			for (int i = 0; i < 5; i++) {
				card[i] = Integer.valueOf(str[i]);
			}
			for (int i = 0; i < 5; i++) {
				int min = i;
				for (int j = i; j < 5; j++) {
					if (card[j] < card[min]) {
						min = j;
					}
				}
				int swap = card[i];
				card[i] = card[min];
				card[min] = swap;
			}
			if (card[0] == card[1] || card[1] == card[2] || card[2] == card[3] || card[3] == card[4]) {
				op = true;
			}
			if ((card[0] == card[1] && (card[2] == card[3] || card[3] == card[4])) || (card[1] == card[2] && card[3] == card[4])) {
				tp = true;
			}
			if (card[0] == card[2] || card[1] == card[3] || card[2] == card[4]) {
				tc = true;
			}
			if ((card[0] + 1 == card[1] || card[0] + 12 == card[4]) && card[1] + 1 == card[2] && card[2] + 1 == card[3] && card[3] + 1 == card[4]) {
				st = true;
			}
			if ((card[0] == card[1] && card[2] == card[4]) || (card[0] == card[2] && card[3] == card[4])) {
				fh = true;
			}
			if (card[0] == card[3] || card[1] == card[4]) {
				fc = true;
			}
			if (fc) {
				System.out.println("four card");
			} else if (fh) {
				System.out.println("full house");
			} else if (st) {
				System.out.println("straight");
			} else if (tc) {
				System.out.println("three card");
			} else if (tp) {
				System.out.println("two pair");
			} else if (op) {
				System.out.println("one pair");
			} else {
				System.out.println("null");
			}
		}
	}
}