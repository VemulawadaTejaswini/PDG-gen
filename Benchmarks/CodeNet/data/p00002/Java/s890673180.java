import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main();
	}

	Main() {
		Scanner sc = new Scanner(System.in);
		try {
			while (true) {
				int a, b;
				a = sc.nextInt();
				b = sc.nextInt();
				int c = a + b;
				System.out.println((c + "").length());
			}
		} catch (Exception e) {
		}
	}
}