import java.util.HashMap;
import java.util.Scanner;

public class Main {
	final boolean DEBUG = true;
	long d = 1000000007l;
	void run() {
		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		char[] txt = scan.next().toCharArray();
		char[] pat = scan.next().toCharArray();
		int tl = txt.length;
		int pl = pat.length;
		if (tl < pl)
			return;
		
		long h = 1, p = 0, t = 0;
		for (int i = 0; i < pl; i++) {
			h = h * d;
			p = d * p + pat[i];
			t = d * t + txt[i];
		}
		
		for (int i = 0; i <= tl - pl; i++) {
			if (p == t)
				sb.append(i + "\n");
			if (i + pl < tl)
				t = t * d + txt[i + pl] - txt[i] * h;
		}
		System.out.print(sb.toString());
	}
	public static void main(String[] args) {
		new Main().run();
	}
}

