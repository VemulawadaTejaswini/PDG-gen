import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.next();
			int max = 0;
			int cnt = 0;
			for (int i = 0; i < str.length() - 1; i++) {
				if (str.charAt(i) == str.charAt(i + 1)) {
					cnt++;
				} else {
					max = Math.max(max, cnt);
					cnt = 0;
				}
			}
			max = Math.max(max, cnt);
			if (max > 1) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
