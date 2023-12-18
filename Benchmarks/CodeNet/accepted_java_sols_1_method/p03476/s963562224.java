import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int[] p = new int[100001];
		int [] p2017 = new int[100001];
		int count = 0;
		for (int i = 2; i <= 100000; i++) {
			if (p[i] != -1) {
				p[i] = 1;
				if (p[(i + 1) / 2] > 0)
					count++;
				for (int j = 2; i * j <= 100000; j++) {
					p[i * j] = -1;
				}
			}
			p2017[i] = count;
		}
		int q = Integer.parseInt(sc.next());
		int l;
		int r;
		for (int i = 0; i < q; i++) {
			l = Integer.parseInt(sc.next());
			r = Integer.parseInt(sc.next());
			out.println(p2017[r] - p2017[l - 1]);
		}
		out.flush();
	}
}