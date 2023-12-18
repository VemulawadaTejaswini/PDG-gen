import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int c = 0;
			if (n == 0 && x == 0) {
				break;
			}
			for (int i = 1; i < n - 1; i++) {
				for (int j = i + 1; j <= n; j++) {
					if (i + j < x) {
						if (x - i - j <= n && x - i - j > j) {
							c++;
						}
					}
				}
			}
			System.out.println(c);
		}
    }
}

