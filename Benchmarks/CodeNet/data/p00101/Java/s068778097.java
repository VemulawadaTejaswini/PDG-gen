import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < t; i++) {
			String s = sc.nextLine();
			s = s.replaceAll("Hoshino", "Hoshina");
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}