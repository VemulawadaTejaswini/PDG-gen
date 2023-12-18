
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int x = sc.nextInt();
			int n = sc.nextInt();
			Set<Integer> p = new HashSet<>();

			for (int i = 0; i < n; i++) {
				p.add(sc.nextInt());
			}

			for (int i = 0; i < 100; i++) {
				if (!p.contains(x - i)) {
					System.out.println(x - i);
					return;
				} else if(!p.contains(x + i)) {
					System.out.println(x + i);
					return;
				}
			}
		}
	}
}
