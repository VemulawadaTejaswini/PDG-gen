import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int length = sc.nextInt();
			String s = sc.next();
			int ans = 1;
			char top = s.charAt(0);
			for (int i = 1; i < length; i++) {
				char temp = s.charAt(i);
				if (top == temp) {
					continue;
				}
				top = temp;
				ans++;
			}
			System.out.println(ans);
		}
	}
}
