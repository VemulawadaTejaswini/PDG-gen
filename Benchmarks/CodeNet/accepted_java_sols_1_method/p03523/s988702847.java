import java.util.*;
import java.util.stream.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(sc.next());

		int[] ai = { 0, 4, 6, 8 };
		for (int i: ai)
			if (i < sb.length() && sb.charAt(i) != 'A' || i == sb.length())
				sb.insert(i, "A");
		System.out.println(sb.toString().equals("AKIHABARA") ? "YES" : "NO");
	}
}
