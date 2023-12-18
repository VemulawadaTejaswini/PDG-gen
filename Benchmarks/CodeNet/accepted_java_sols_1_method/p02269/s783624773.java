import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < n; i++) {
			String op = scan.next();

			if ("insert".equals(op)) {
				set.add(scan.next());
			} else if ("find".equals(op)) {
				if (set.contains(scan.next())) {
					System.out.println("yes");
				}
				else {
					System.out.println("no");
				}
			}
		}

		scan.close();

	}

}