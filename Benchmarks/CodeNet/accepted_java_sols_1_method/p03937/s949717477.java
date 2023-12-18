import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int h = Integer.parseInt(sa[0]);
		int w = Integer.parseInt(sa[1]);
		char[][] a = new char[h + 2][w + 2];
		for (int i = 1; i <= h; i++) {
			String s = br.readLine();
			for (int j = 1; j <= w; j++) {
				a[i][j] = s.charAt(j - 1);
			}
		}
		br.close();
		a[1][0] = '#';
		a[h][w + 1] = '#';

		boolean ans = true;
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				if (a[i][j] == '#') {
					if (a[i + 1][j] == '#' && a[i][j + 1] != '#'
							|| a[i + 1][j] != '#' && a[i][j + 1] == '#') {
					} else {
						ans = false;
						break;
					}
					if (a[i - 1][j] == '#' && a[i][j - 1] != '#'
							|| a[i - 1][j] != '#' && a[i][j - 1] == '#') {
					} else {
						ans = false;
						break;
					}
				}
			}
		}
		if (ans) {
			System.out.println("Possible");
		} else {
			System.out.println("Impossible");
		}
	}
}
