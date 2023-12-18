import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<String> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			set.add(sc.next());
		}
		System.out.println(set.size()==3 ? "Three" : "Four");
	}
}
