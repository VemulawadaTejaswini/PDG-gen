import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] cs = sc.next().toCharArray();
		int t = 0;
		for (int i = 0; i < cs.length; i++) {
			t += cs[i] - '0';
		}
		if (t % 9 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
