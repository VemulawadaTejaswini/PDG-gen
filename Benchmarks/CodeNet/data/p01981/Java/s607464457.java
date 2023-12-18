import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			String g = scan.next();
			if (g.equals("#"))
				return;
			int y = scan.nextInt();
			int m = scan.nextInt();
			int d = scan.nextInt();
			if (y < 31)
				System.out.println(g + " " + y + " " + m + " " + d);
			else if (m < 5)
				System.out.println(g + " " + y + " " + m + " " + d);
			else
				System.out.println("? " + y + " " + m + " " + d);
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}

}

