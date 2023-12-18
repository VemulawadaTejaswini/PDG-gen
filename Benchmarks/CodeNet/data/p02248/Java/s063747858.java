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
		String p = scan.next();

		StFind f = new StFind(t, p, false);

		scan.close();
		System.exit(0);
	}
}

class StFind {
	boolean debug;

	public StFind(String t, String p, boolean d) {
		debug = d;
		createCharPt(p);
		createMatchPt(p);

		for (int st = 0; st < t.length() - p.length() + 1;) {
			int x = 0;
			if ((x = isBaEqual(t, p, st)) == p.length())
				System.out.println(st);
			st += Math.max(sft[t.charAt(st + p.length() - 1)], msft[x]);
		}
	}

	int[] msft;

	private void createMatchPt(String p) {
		msft = new int[p.length() + 1];
		msft[0] = 1;

		for (int sft = p.length(); sft > 0; sft--) {
			for (int m = 1; m < msft.length; m++) {
				if (p.length() - m - sft >= 0 && p.charAt(p.length() - m) != p.charAt(p.length() - m - sft))
					break;
				msft[m] = sft;
			}
		}

		if (debug)
			for (int i = 0; i < msft.length; i++)
				System.out.println("--- " + i + " : " + msft[i]);
	}

	int[] sft = new int[Character.MAX_CODE_POINT];

	private void createCharPt(String p) {
		for (int i = 0; i < sft.length; i++)
			sft[i] = p.length();

		for (int i = 1; i < p.length(); i++) {
			char c = p.charAt(p.length() - i - 1);
			if (sft[c] == p.length())
				sft[c] = i;
		}

		if (debug)
			for (int i = 0; i < sft.length; i++)
				if (('a' <= i && i <= 'z') || ('A' <= i && i <= 'Z') || ('0' <= i && i <= '9'))
					System.out.println("-- " + (char) i + " : " + sft[i]);
	}

	private boolean isEqual(String t, String p, int st) {
		for (int i = 0; i < p.length(); i++)
			if (t.charAt(i + st) != p.charAt(i))
				return false;
		return true;

	}

	private int isBaEqual(String t, String p, int st) {
		for (int i = 0; i < p.length(); i++)
			if (t.charAt(p.length() - 1 + st) != p.charAt(p.length() - 1)) {
				return i;
			}
		return p.length();
	}

}