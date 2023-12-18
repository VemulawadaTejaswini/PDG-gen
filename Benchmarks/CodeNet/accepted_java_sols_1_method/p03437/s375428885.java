import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());

		if (x % y != 0) {
			System.out.println(x);
		} else {
			System.out.println(-1);
		}

		sc.close();
	}
}