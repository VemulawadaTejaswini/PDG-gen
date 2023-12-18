import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<String> hs = new HashSet<>();
		for (int i = 0; i < n; i++) {
			hs.add(sc.next());
		}
		if (hs.size() == 3) {
			System.out.println("Three");
		} else {
			System.out.println("Four");
		}

	}
}
