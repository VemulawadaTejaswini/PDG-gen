import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t;
		while ((t = in.nextInt()) > 0) {
			int n = in.nextInt();
			while (n-- > 0) {
				t += in.nextInt();
				t -= in.nextInt();
			}
			System.out.println((t <= 0) ? "OK" : t);
		}
	}
}