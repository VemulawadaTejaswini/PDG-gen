import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.next();
			int len = str.length();
			int ans = 0;
			int temp = 0;
			for (int i = 0; i < len; i++) {
				char c = str.charAt(i);
				if (c == 'A' || c == 'C' || c == 'G' || c == 'T') {
					temp++;
				} else {
					ans = Math.max(ans, temp);
					temp = 0;
				}
			}
			System.out.print(Math.max(ans, temp));
		}
	}
}
