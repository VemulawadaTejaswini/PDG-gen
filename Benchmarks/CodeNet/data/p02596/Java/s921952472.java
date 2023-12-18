import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {

			String data = scanner.nextLine();

			int K = Integer.parseInt(data);
			int x = 7 % K;
			Set<Integer> s = new HashSet<Integer>();
			int i = 1;
			int ans = -1;

			while (!s.contains(x)) {
				if (x == 0) {
					ans = i;
					break;
				}

				s.add(x);
				x = (x * 10 + 7) % K;
				i++;
			}

			System.out.println(ans);
		}
	}
}