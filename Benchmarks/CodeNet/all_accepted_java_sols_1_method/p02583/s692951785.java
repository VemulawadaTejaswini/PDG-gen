import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		n = sc.nextInt();

		List<Integer> l = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			l.add(sc.nextInt());
		}

		int ans = 0;

		for (int x = 0; x < n; x++) {
			for (int y = x + 1; y < n; y++) {
				for (int z = y + 1; z < n; z++) {
					int a = l.get(x);
					int b = l.get(y);
					int c = l.get(z);

					if (a != b && b != c && c != a && a + b > c && b + c > a && c + a > b) {
						ans++;
					}
				}
			}
		}

		System.out.println(ans);

		sc.close();
	}

}
