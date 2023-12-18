import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int hasNext;
		while ((hasNext = in.nextInt()) != 0) {
			while (hasNext-- > 0) {
				int pm = in.nextInt();
				int pe = in.nextInt();
				int pj = in.nextInt();
				int all;
				if (pm == 100 || pe == 100 || pj == 100
						|| (all = pm + pe + pj) >= 240 || (pm + pe) >= 180) {
					System.out.println('A');
					continue;
				} else if (all >= 210 || (all >= 150 && (pm >= 80 || pe >= 80))) {
					System.out.println('B');
					continue;
				} else {
					System.out.println('C');
				}
			}
		}
	}
}