import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			long min = sc.nextLong();
			long ans = 0;
			for (int i = 1; i < n; i++) {
				long tmp = sc.nextLong();
				if (min > tmp) {
					ans += min - tmp;
				}
				min = Math.max(min, tmp);
			}
			System.out.println(ans);
		}
	}
}