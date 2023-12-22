import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s1 = br.readLine().split(" ");
		int h = Integer.parseInt(s1[0]);
		int w = Integer.parseInt(s1[1]);
		int n = Integer.parseInt(s1[2]);
		String[] s2 = br.readLine().split(" ");
		int r = Integer.parseInt(s2[0]);
		int c = Integer.parseInt(s2[1]);
		String s = br.readLine();
		String t = br.readLine();
		br.close();

		int x = c;
		for (int i = 0; i < n; i++) {
			char cs = s.charAt(i);
			char ct = t.charAt(i);
			if (cs == 'L') {
				x--;
			}
			if (x < 1) {
				System.out.println("NO");
				return;
			}
			if (ct == 'R' && x < w) {
				x++;
			}
		}

		x = c;
		for (int i = 0; i < n; i++) {
			char cs = s.charAt(i);
			char ct = t.charAt(i);
			if (cs == 'R') {
				x++;
			}
			if (x > w) {
				System.out.println("NO");
				return;
			}
			if (ct == 'L' && x > 1) {
				x--;
			}
		}

		x = r;
		for (int i = 0; i < n; i++) {
			char cs = s.charAt(i);
			char ct = t.charAt(i);
			if (cs == 'U') {
				x--;
			}
			if (x < 1) {
				System.out.println("NO");
				return;
			}
			if (ct == 'D' && x < h) {
				x++;
			}
		}

		x = r;
		for (int i = 0; i < n; i++) {
			char cs = s.charAt(i);
			char ct = t.charAt(i);
			if (cs == 'D') {
				x++;
			}
			if (x > h) {
				System.out.println("NO");
				return;
			}
			if (ct == 'U' && x > 1) {
				x--;
			}
		}
		System.out.println("YES");
	}
}
