import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int sum = 0;
			String str = sc.next();
			int n = str.length();
			for (int i = 0; i < n; i++) {
				char c = str.charAt(i);
				sum += c - '0';
			}
			System.out.printf("%d\n", sum);
		}
	}
}