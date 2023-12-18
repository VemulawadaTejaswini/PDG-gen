import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String cards = sc.nextLine();
			if (cards == "-") break;
			String cds[] = cards.split("");
			int cdlength = cards.length();
			String cds2[] = new String[cdlength];
			int repeat = sc.nextInt();
			for (int i = 0; i < repeat; i++) {
				int shuffle = sc.nextInt();
				if (i % 2 == 0) {
					for (int j = 0, k = shuffle; j < shuffle; j++, k++) {
						if (k == cdlength) {
							k =0;
						}
						cds2[j] = cds[k];
					}
				} else {
					for (int j = 0, k = shuffle; j < shuffle; j++, k++) {
						if (k == cdlength) {
							k =0;
						}
						cds[j] = cds2[k];
					}
				}
			}
			String after = "";
			if (repeat % 2 == 0) {
				for (int i = 0; i < cdlength; i++) {
					after += cds[i];
				}
				System.out.println(after);
			} else {
				for (int i = 0; i < cdlength; i++) {
					after += (cds2[i]);
				}
				System.out.println(after);
			}
		}
	}
}