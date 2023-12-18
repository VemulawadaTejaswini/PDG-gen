import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String last = "";
		String start = "";

		Set<String> set = new HashSet<String>();

		for (int i = 0; i < n; i++) {
			String str = sc.next();

			start = str.substring(0, 1);

			if(i!=0) {
				if (!last.equals(start)) {
					break;
				}
			}

			last = str.substring(str.length() - 1);
			set.add(str);
		}

		if (set.size() != n) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}

	}

}
