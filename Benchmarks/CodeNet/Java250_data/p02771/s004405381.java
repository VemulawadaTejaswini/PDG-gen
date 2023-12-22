import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int cnt = 0;
		if (a == b) {
			cnt++;
		}
		if (b == c) {
			cnt++;
		}
		if (c == a) {
			cnt++;
		}
		if (cnt == 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}