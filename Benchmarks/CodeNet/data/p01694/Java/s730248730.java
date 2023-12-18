import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;

		while (true) {

			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			List<String> step = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				step.add(sc.next());
			}

			for (int i = 0; i < n; i++) {
				if ((ans == 0 || ans % 2 == 0) && (step.get(i).substring(1).equals("u")
						&& step.get(i + 1).substring(1).equals("u"))) {
					ans++;
				} else if (ans % 2 == 1 && (step.get(i).substring(1).equals("d")
						&& step.get(i + 1).substring(1).equals("d"))) {
					ans++;
				}
			}

		}
		System.out.println(ans);
	}
}
