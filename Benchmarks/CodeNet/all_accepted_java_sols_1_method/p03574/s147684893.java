import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();

		String S[] = new String[50];

		for (int i = 0; i < H; i++) {
			S[i] = sc.next();
		}

		for (int i = 0; i < H; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < W; j++) {
				if (S[i].charAt(j) == '#') {
					sb.append("#");
					continue;
				}

				int mineNum = 0;

				for (int x = i - 1; x < i + 2; x++) {
					for (int y = j - 1; y < j + 2; y++) {
						if (x >= 0 && x < H && y >= 0 && y < W
								&& S[x].charAt(y) == '#') {
							mineNum++;
						}
					}
				}

				sb.append(String.valueOf(mineNum));
			}
			S[i] = sb.toString();
		}

		for (int i = 0; i < H; i++) {
			System.out.println(S[i]);
		}
	}
}