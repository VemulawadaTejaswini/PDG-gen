import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] s = new String[h + 2];
		for (int i = 1; i < h + 1; i++) {
			s[i] = "k" + sc.next() + "k";
		}
		for (int i = 0; i < w + 2; i++) {
			s[0] += "k";
			s[h + 1] += "k";
		}
		char[][] ch = new char[h + 2][w + 2];
		for (int i = 0; i < h + 2; i++) {
			for (int j = 0; j < w + 2; j++) {
				ch[i][j] = s[i].charAt(j);
			}
		}
		int count = 0;
		for (int i = 0; i < h + 2; i++) {
			for (int j = 0; j < w + 2; j++) {
				if (ch[i][j] == '.') {
					if (ch[i - 1][j - 1] == '#') {
						count++;
					}
					if (ch[i - 1][j] == '#') {
						count++;
					}
					if (ch[i - 1][j + 1] == '#') {
						count++;
					}
					if (ch[i][j - 1] == '#') {
						count++;
					}
					if (ch[i][j + 1] == '#') {
						count++;
					}
					if (ch[i + 1][j - 1] == '#') {
						count++;
					}
					if (ch[i + 1][j] == '#') {
						count++;
					}
					if (ch[i + 1][j + 1] == '#') {
						count++;
					}
				}
				if (ch[i][j] == '#') {
					System.out.print("#");
				} else if (ch[i][j] == '.') {
					System.out.print(count);
				}
				count = 0;
			}
			if (i != 0 || i != h + 1) {
				System.out.println("");
			}
		}
	}
}
