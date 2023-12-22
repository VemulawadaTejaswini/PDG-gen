import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] s = new boolean[13];
		boolean[] h = new boolean[13];
		boolean[] c = new boolean[13];
		boolean[] d = new boolean[13];
		Arrays.fill(s, false);
		Arrays.fill(h, false);
		Arrays.fill(c, false);
		Arrays.fill(d, false);
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String[] strAry = br.readLine().split(" ");
			switch (strAry[0]) {
			case "S":
				s[Integer.parseInt(strAry[1]) - 1] = true;
				break;
			case "H":
				h[Integer.parseInt(strAry[1]) - 1] = true;
				break;
			case "C":
				c[Integer.parseInt(strAry[1]) - 1] = true;
				break;
			case "D":
				d[Integer.parseInt(strAry[1]) - 1] = true;
				break;
			}
		}
		for (int i = 0; i < s.length; i++) if (!s[i]) System.out.println("S " + (i + 1));
		for (int i = 0; i < h.length; i++) if (!h[i]) System.out.println("H " + (i + 1));
		for (int i = 0; i < c.length; i++) if (!c[i]) System.out.println("C " + (i + 1));
		for (int i = 0; i < d.length; i++) if (!d[i]) System.out.println("D " + (i + 1));
	}
}