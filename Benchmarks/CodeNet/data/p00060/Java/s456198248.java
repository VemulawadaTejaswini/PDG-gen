import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int c1 = in.nextInt();
			int c2 = in.nextInt();
			int c3 = in.nextInt();
			int p = 20 - (c1 + c2);
			boolean isYes;
			if (10 <= p) {
				isYes = true;
			} else {
				int under = p;
				if (p >= c1) {
					under--;
				}
				if (p >= c2) {
					under--;
				}
				if (p >= c3) {
					under--;
				}
				isYes = under >= 4;
			}
			System.out.println(isYes ? "YES" : "NO");
		}
	}
}