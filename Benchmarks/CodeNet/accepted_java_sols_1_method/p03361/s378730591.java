import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int H = s.nextInt();
		int W = s.nextInt();
		String sl = null;
		String[] sa = new String[W];
		String[][] sda = new String[H][W];

		boolean b = true;

		for (int i = 0; i < H; i++) {
			sl = s.next();
			sa = sl.split("");
			for (int j = 0; j < W; j++) {
				sda[i][j] = sa[j];
			}
		}

		/**/
		for (int h = 0; h < H; h++) {
			for (int w = 0; w < W; w++) {
				if (b) {
					if (sda[h][w].equals("#")) {
						/*100
						000
						000*/
						if (h == 0 && w == 0) {
							if (sda[h][w + 1].equals("#") ||
									sda[h + 1][w].equals("#")) {
							} else {
								b = false;
								break;
							}
						}
						/*001
						000
						000*/
						else if (h == 0 && w == W - 1) {
							if (sda[h][w - 1].equals("#") ||
									sda[h + 1][w].equals("#")) {
							} else {
								b = false;
								break;
							}
						}
						/*000
						000
						100*/
						else if (h == H - 1 && w == 0) {
							if (sda[h - 1][w].equals("#") ||
									sda[h][w + 1].equals("#")) {
							} else {
								b = false;
								break;
							}
						}
						/*000
						000
						001*/
						else if (h == H - 1 && w == W - 1) {
							if (sda[h][w - 1].equals("#") ||
									sda[h - 1][w].equals("#")) {
							} else {
								b = false;
								break;
							}
						}
						/*010
						000
						000*/
						else if (h == 0) {
							if (sda[h][w - 1].equals("#") ||
									sda[h][w + 1].equals("#") ||
									sda[h + 1][w].equals("#")) {
							} else {
								b = false;
								break;
							}
						}
						/*000
						000
						010*/
						else if (h == H - 1) {
							if (sda[h][w - 1].equals("#") ||
									sda[h - 1][w].equals("#") ||
									sda[h][w + 1].equals("#")) {
							} else {
								b = false;
								break;
							}
						}
						/*000
						100
						000*/
						else if (w == 0) {
							if (sda[h - 1][w].equals("#") ||
									sda[h][w + 1].equals("#") ||
									sda[h + 1][w].equals("#")) {
							} else {
								b = false;
								break;
							}
						}
						/*000
						001
						000*/
						else if (w == W - 1) {
							if (sda[h][w - 1].equals("#") ||
									sda[h - 1][w].equals("#") ||
									sda[h + 1][w].equals("#")) {
							} else {
								b = false;
								break;
							}
						}
						/*000
						010
						000*/
						else {
							if (sda[h][w - 1].equals("#") ||
									sda[h - 1][w].equals("#") ||
									sda[h][w + 1].equals("#") ||
									sda[h + 1][w].equals("#")) {
							} else {
								b = false;
								break;
							}
						}
					}
				}
			}
		}
		String ans = b ? "Yes" : "No";
		System.out.println(ans);
	}

}
