import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	Scanner sc = new Scanner(System.in);

	void run() {
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		int b3 = sc.nextInt();
		int b = b1 * 4 + b2 * 2 + b3;
		switch (b) {
		case 4:
		case 2:
		case 0:
			System.out.println("Close");
			break;
		case 6:
		case 1:
			System.out.println("Open");
			break;
		}
	}

	public static void main(String[] args) {

		new Main().run();
	}

}