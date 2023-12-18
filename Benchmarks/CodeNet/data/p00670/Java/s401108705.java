import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, s;
		int pow[];

		while (true) {
			n = sc.nextInt();
			s = sc.nextInt();
			if ((n | s) == 0) {
				break;
			}

			pow = new int[n];
			for (int i = 0; i < n; i++) {
				pow[i] = sc.nextInt();
			}
			Arrays.sort(pow);

			int id = 0;
			int cnt = 0;
			for (int i = n - 1; 0 <= i; i--) {
				while (id < n && pow[i] + pow[id] <= s) {
					id++;
				}
				if (id < n && id != i &&  s < pow[i] + pow[id]) {
					cnt++;
					id++;
				}
				if (n <= id || i <= id) {
					break;
				}
			}
			
			System.out.println(cnt);
		}
	}
}