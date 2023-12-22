
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		Set<String> set = new HashSet<>();
		String[] in = sc.nextLine().split(" ");
		int old = in.length;
		for (String string : in) {
			set.add(string);
		}
		if (old != set.size()) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}

	}
}
