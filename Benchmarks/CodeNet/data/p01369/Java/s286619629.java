import java.util.Scanner;

public class Main {
	final static char[] r = "yuiophjklnm".toCharArray();

	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			char[] moji = in.next().toCharArray();
			if (moji[0] == '#') {
				break;
			}
			boolean preHand = isR(moji[0]);
			int count = 0;
			for (int i = 1; i < moji.length; i++) {
				boolean hand = isR(moji[i]);
				if (preHand != hand) {
					preHand = hand;
					count++;
				}
			}
			System.out.println(count);
		}
		in.close();
	}

	static boolean isR(char c) {
		for (char rc : r) {
			if (c == rc)
				return true;
		}
		return false;
	}
}