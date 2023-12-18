import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	 	int h = sc.nextInt();
 		int w = sc.nextInt();
		char[][] s = new char[h][w];
		boolean flag = true;

		for (int i = 0; i < h; i++) {
			String l = sc.next();
			for (int j = 0; j < w; j++) {
				s[i][j] = l.charAt(j);
			}
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (s[i][j] == '.') {
					continue;
				}
				boolean up = false;
				boolean down = false;
				boolean left = false;
				boolean right = false;

				if (i > 0 && s[i - 1][j] == '#') {
					up = true;
				}
				if (i < h - 1 && s[i + 1][j] == '#') {
					down = true;
				}
				if (j > 0 && s[i][j - 1] == '#') {
					left = true;
				}
				if (j < w - 1 && s[i][j + 1] == '#') {
					right = true;
				}

				if (!up && !down && !left && !right) {
					flag = false;
					break;
				}
			}
			if (!flag) {
				break;
			}
		}

		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
  }
}
