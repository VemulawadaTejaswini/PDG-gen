import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<Character> set = new HashSet<>();
		set.add('A');
		set.add('C');
		set.add('G');
		set.add('T');
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int max = 0;
		for (int i = 0; i < S.length(); i++) {
			int tmp = 0;
			for (int j = i; j < S.length(); j++) {
				if (set.contains(S.charAt(j))) {
					tmp++;
				} else {
					break;
				}
			}
			max = Math.max(max, tmp);
		}
		System.out.println(max);
	}
}