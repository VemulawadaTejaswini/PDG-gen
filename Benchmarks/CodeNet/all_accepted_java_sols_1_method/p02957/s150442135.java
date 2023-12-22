import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int k = (a + b) % 2 == 0 ? (a+b)/2: -1;

		if (k != -1) {
			System.out.println(k);
		} else {
			System.out.println("IMPOSSIBLE");
		}
	}
}
