import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		String t = scan.next();

		int q = scan.nextInt();
		String[] p = new String[q];
		for (int i = 0; i < q; i++)
			p[i] = scan.next();

		PtFind f = new PtFind(t, p, false);

		scan.close();
		System.exit(0);
	}
}

class PtFind {
	boolean debug;

	public PtFind(String t, String[] p, boolean d) {
		debug = d;

		boolean[] result = new boolean[p.length];
		int[] length = new int[p.length];
		int[] hash = new int[p.length];
		List<Integer> unresolve = new ArrayList<Integer>();
		for (int i = 0; i < p.length; i++) {
			length[i] = p[i].length();
			hash[i] = getHash(p[i], 0, length[i]);
			unresolve.add(i);
		}

		int[] thash = new int[1001];
		int[] tcalc = new int[1001];
		int[] multi = new int[1001];
		multi[0] = 1;
		for (int i = 1; i < tcalc.length; i++) {
			tcalc[i] = -1;
			multi[i] = multi[i - 1] * 101;
			multi[i] %= 100000;
		}
		for (int i = 0; i < length.length; i++) {
			int le = length[i];
			if (tcalc[le] == -1) {
				tcalc[le] = 0;
				thash[le] = getHash(t, 0, le);
			}
		}

		for (int st = 0; st < t.length(); st++) {
			for (int i = 0; i < length.length; i++) {
				if (result[i])
					continue;

				int le = length[i];
				if (st + le >= t.length())
					continue;
				
				if (tcalc[le] != st) {
					tcalc[le] = st;
					thash[le] = (thash[le] * 101) + t.charAt(st + le - 1) - t.charAt(st - 1) * multi[le];
				}

				if (thash[le] == hash[i])
					if (p[i].equals(t.substring(st, st + le)))
						result[i] = true;
			}

		}

		for (int i = 0; i < result.length; i++)
			if (result[i])
				System.out.println("1");
			else
				System.out.println("0");
	}

	private int getHash(String s, int start, int length) {
		int ret = 0;
		for (int i = start; i < start + length; i++) {
			ret *= 101;
			ret += s.charAt(i);
			ret %= 100000;
		}
		return ret;
	}
}