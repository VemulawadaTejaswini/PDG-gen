import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int w = s.nextInt();
		int a = s.nextInt();
		int b = s.nextInt();

		int answer = b - (a + w);
		int ans = a - (b + w);
		if (a <= b) {
			if (answer < 0) {
				System.out.println("0");
			} else {
				System.out.println(answer);
			}
		}else if (a > b) {
			if (ans < 0) {
				System.out.println("0");
			} else {
				System.out.println(ans);
			}
		}

	}
}