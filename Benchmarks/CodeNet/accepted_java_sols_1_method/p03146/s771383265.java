import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		sc.close();
		Set<Integer> se = new HashSet<Integer>();
		se.add(s);
		for (int i = 2; i < 1000000; i++) {
			if (s % 2 == 0) {
				s = s / 2;
			} else {
				s = 3 * s + 1;
			}
			if (se.contains(s)) {
				System.out.println(i);
				return;
			}
			se.add(s);
		}
	}
}
