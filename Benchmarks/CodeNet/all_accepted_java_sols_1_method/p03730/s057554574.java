import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		boolean t = false;
		int cnt = 1;
		while (true) {
			if ((a * cnt) % b == c) {
				t = true;
			}
			if (cnt == b) {
				break;
			}
			cnt++;
		}
		if (t) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
