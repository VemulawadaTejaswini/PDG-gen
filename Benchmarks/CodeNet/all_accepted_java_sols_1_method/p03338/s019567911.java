import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		Set<String> first = new HashSet<>();
		Set<String> second = new HashSet<>();

		int max = 0;
		for (int i = 1; i < n; i++) {
			first.clear();
			second.clear();

			String firstStr = s.substring(0, i);
			String secondStr = s.substring(i, n);

			for (char c : firstStr.toCharArray()) {
				first.add(String.valueOf(c));
			}
			for (char c : secondStr.toCharArray()) {
				second.add(String.valueOf(c));
			}

			int cnt = 0;
			for (Iterator<String> iterator = first.iterator(); iterator.hasNext();) {
				String str = iterator.next();
				if (second.contains(str)) cnt++;
			}

			max = Math.max(max, cnt);

		}

		System.out.println(max);

		sc.close();

	}

}
