import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (int n; (n = new Integer(s.nextLine())) > 0;) {
			int[] c = { 0, 0, 0 };
			int[] d = { 0, 0, 0 };
			for (; n-- > 0;) {
				String[] sp = s.nextLine().split("[ :]");
				int[] is = { new Integer(sp[0]), new Integer(sp[1]),
						new Integer(sp[2]) };
				is[0] += (is[0] < 3 ? 24 : 0);
				int t = is[2] + (is[1] < is[2] ? 0 : 60) - is[1];
				if (11 <= is[0] && is[0] < 15) {
					if (t < 9)
						++c[0];
					++d[0];
				} else if (18 <= is[0] && is[0] < 21) {
					if (t < 9)
						++c[1];
					++d[1];
				} else if (21 <= is[0] && is[0] < 27) {
					if (t < 9)
						++c[2];
					++d[2];
				}
			}
			String[] r = { "lunch", "dinner", "midnight" };
			for (int i = 0; i < 3; ++i) {
				System.out.print(r[i] + " ");
				if (d[i] > 0) {
					System.out.println((100 * c[i] / d[i]));
				} else {
					System.out.println("no guest");
				}
			}
		}
	}
}