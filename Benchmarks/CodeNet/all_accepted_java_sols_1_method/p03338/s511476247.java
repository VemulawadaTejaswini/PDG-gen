import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s = scanner.next();
		int max = 0;

		for (int i = 1; i < s.length(); i++) {
			String x = s.substring(0, i);
			String y = s.substring(i, s.length());
			Set<Character> setX = new HashSet<>();
			Set<Character> setY = new HashSet<>();
			for (int xi = 0; xi < x.length(); xi++) {
				setX.add(x.charAt(xi));
			}
			for (int yi = 0; yi < y.length(); yi++) {
				setY.add(y.charAt(yi));
			}
			int tmp = 0;
			for (char c : setX) {
				if (setY.contains(c))
					tmp++;
			}
			max = Math.max(tmp, max);
		}

		System.out.println(max);
	}
}
