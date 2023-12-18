import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.next();
		Set<String> set = new HashSet<>();
		while (sc.hasNext()) {
			set.add(sc.next());
		}
		System.out.println(set.size() > 3 ? "Four" : "Three");
	}
}
