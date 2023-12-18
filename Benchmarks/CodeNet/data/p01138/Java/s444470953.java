import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = Integer.parseInt(sc.next());
			if (n == 0)
				break;
			int[] a = new int[25 * 3600];
			for (int i = 0; i < n; i++) {
				String[] t = sc.next().split(":");
				int departure = Integer.parseInt(t[0]) * 3600 + Integer.parseInt(t[1]) * 60 + Integer.parseInt(t[2]) + 1;
				t = sc.next().split(":");
				int arrive = Integer.parseInt(t[0]) * 3600 + Integer.parseInt(t[1]) * 60 + Integer.parseInt(t[2]) + 1;
				a[departure]++;
				a[arrive]--;
			}
			int count = 1;
			for (int i = 1; i < 25 * 3600; i++) {
				a[i] += a[i - 1];
				if (a[i] > a[i - 1] && a[i - 1] != 0)
					count++;
			}
			System.out.println(count);
		}
	}
}
