import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int h = in.nextInt();
			int w = in.nextInt();
			int n = in.nextInt();
			int sr = in.nextInt() - 1;
			int sc = in.nextInt() - 1;
			String s = in.next();
			String t = in.next();
			
			boolean ret = true;
			int ll = sc;
			int rr = sc;
			int uu = sr;
			int dd = sr;
			for (int i = 0; i < n; i++) {
				char ss = s.charAt(i);
				char tt = t.charAt(i);
				
				switch (ss) {
				case 'L':
					ll--;
					if (ll < 0) {
						ret = false;
						break;
					}
					break;
				case 'R':
					rr++;
					if (rr >= w) {
						ret = false;
						break;
					}
					break;
				case 'U':
					uu--;
					if (uu < 0) {
						ret = false;
						break;
					}
					break;
				case 'D':
					dd++;
					if (dd >= h) {
						ret = false;
						break;
					}
					break;
				}
				
				switch (tt) {
				case 'L':
					if (rr > 0) {
						rr--;
					}
					break;
				case 'R':
					if (ll < w - 1) {
						ll++;
					}
					break;
				case 'U':
					if (dd > 0) {
						dd--;
					}
					break;
				case 'D':
					if (uu < h - 1) {
						uu++;
					}
					break;
				}
			}

			System.out.println(ret ? "YES" : "NO");
		}
	}

}
