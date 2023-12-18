import java.util.*;

public class MainTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lock = 0;
		int n = sc.nextInt();
		String[] u = new String[n];
		for (int i = 0; i < n; i++)
			u[i] = sc.next();
		int m = sc.nextInt();
		String t;
		for (int i = 0; i < m; i++) {
			t = sc.next();
			for (int j = 0; j < n; j++) {
				if (t.equals(u[j]) && lock == 0) {
					System.out.println("Opened by " + t);
					lock = 1;
					break;
				} else if (t.equals(u[j]) && lock == 1) {
					System.out.println("Closed by " + t);
					lock = 0;
					break;
				} else if (j == n - 1)
					System.out.println("unknown " + t);
			}
		}
		sc.close();
	}
}