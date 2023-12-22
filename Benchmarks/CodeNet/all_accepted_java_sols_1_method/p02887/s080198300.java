import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();

		int count = 1;
		for (int i = 1; i < n; i++) {
			String s1 = s.substring(i - 1, i);
			String s2 = s.substring(i, i + 1);
			if (!s1.equals(s2)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
