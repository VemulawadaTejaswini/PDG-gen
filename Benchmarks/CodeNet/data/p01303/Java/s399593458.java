import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int qn = in.nextInt();
		for (int q = 0; q < qn; q++) {
			int x = in.nextInt();
			int y = in.nextInt();
			int x2 = x + in.nextInt();
			int y2 = y + in.nextInt();
			int cats = in.nextInt();
			int catCounter = 0;
			for (int cat = 0; cat < cats; cat++) {
				int cx = in.nextInt(), cy = in.nextInt();
				if ((x <= cx && cx <= x2) && (y <= cy && cy <= y2)) {
					catCounter++;
				}
			}
			System.out.println(catCounter);
		}
	}
}