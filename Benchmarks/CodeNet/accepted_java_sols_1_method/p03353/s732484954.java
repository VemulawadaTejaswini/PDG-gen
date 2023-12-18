
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int K = sc.nextInt();
		ArrayList<String> subs = new ArrayList<String>();
		for (char tg = 'a'; tg <= 'z'; tg++) {
			for (int i = 0; i < S.length(); i++) {
				if (S.charAt(i) == tg) {
					for (int r = 1; r <= K && i + r <= S.length(); r++) {
						String add = S.substring(i, i + r);
						if (!subs.contains(add))
							subs.add(add);
					}
				}
			}
			if (subs.size() >= K) {
				subs.sort(Comparator.naturalOrder());
				// System.out.println(Arrays.toString(subs.toArray()));
				System.out.println(subs.get(K - 1));
				return;
			}
		}
	}

}
