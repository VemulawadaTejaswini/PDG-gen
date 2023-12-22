import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		HashSet<Character> S_set = new HashSet<Character>();

		for (Character character : S.toCharArray()) {
			S_set.add(character);
		}

		System.out.println(S.length() == S_set.size() ? "yes" : "no");
	}
}