import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		long maxTypeCount = 0;

		for (int i = 0; i < n; i++) {
			String subStart = s.substring(0, i + 1);
			String subEnd = s.substring(i + 1, n);

			long typeCount = subStart.chars()
					.distinct()
					.filter(subStartChar -> subEnd.chars().anyMatch(m -> subStartChar == m))
					.count();
			maxTypeCount = Math.max(maxTypeCount, typeCount);
		}
		System.out.println(maxTypeCount);
	}
}
