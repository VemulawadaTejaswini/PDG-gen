import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		for (int i = 0; i < n; i++) {
			if (sc.next().equals("Y")) {
				System.out.println("Four");
				return;
			}
		}
		System.out.println("Three");
	}
}