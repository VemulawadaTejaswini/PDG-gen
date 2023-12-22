import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int W = in.nextInt();
		char[][] s = new char[H][W];
		for (int i = 0; i < H; i++) {
			s[i] = in.next().toCharArray();
		}
		boolean isOk = true;
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				if (s[i][j] == '#') {
					if ((i + 1 < s.length && s[i + 1][j] == '#') || (i - 1 > -1 && s[i - 1][j] == '#')
							|| (j + 1 < s[i].length && s[i][j + 1] == '#') || (j - 1 > -1 && s[i][j - 1] == '#')) {
					} else {
						isOk = false;
					}
				}
			}
			if (!isOk) {
				break;
			}
		}
		System.out.println(isOk ? "Yes" : "No");
		in.close();
	}
}