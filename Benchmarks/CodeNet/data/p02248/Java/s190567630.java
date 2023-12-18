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

		StFind f = new StFind(t, p);

		scan.close();
		System.exit(0);
	}
}

class StFind {

	public StFind(String t, String p) {
		createPt(p);

		for (int st = 0; st < t.length() - p.length() + 1;) {
			if (isEqual(t, p, st))
				System.out.println(st);
			st += sft[t.charAt(st + p.length() - 1)];
		}
	}

	int[] sft = new int[Character.MAX_CODE_POINT];

	private void createPt(String p) {
		for (int i = 0; i < sft.length; i++)
			sft[i] = p.length();

		for (int i = 1; i < p.length(); i++) {
			char c = p.charAt(p.length() - i - 1);
			if (sft[c] == p.length())
				sft[c] = i;
		}
	}

	private boolean isEqual(String t, String p, int st) {
		for (int i = 0; i < p.length(); i++)
			if (t.charAt(i + st) != p.charAt(i))
				return false;
		return true;
	}

}