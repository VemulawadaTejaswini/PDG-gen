import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		boolean[] d = new boolean[10];
		Arrays.fill(d, true);
		for (int i = 0; i < k; i++)
			d[Integer.parseInt(sc.next())] = false;;
		while (true) {
			int m = n;
			boolean able = true;
			while (m > 0) {
				if (!d[m % 10]) {
					able = false;
					break;
				}
				m /= 10;
			}
			if (able) {
				System.out.println(n);
				return;
			}
			n++;
		}
	}
}