import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		for (int i = 0; i < n - 1; i++) {
			String s = sc.next();
			if (s.compareTo(str) < 0) {
				str = s;
			}
		}
		System.out.println(str);
	}
}