
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		int f = 0;
		int l = 0;
		for (int i = 1; i <= m; i++) {
			int a = Integer.parseInt(sc.next());
			if (a < x) {
				f++;
			}
			if (a > x) {
				l++;
			}
		}
		System.out.println(Math.min(f, l));
		sc.close();
	}
}