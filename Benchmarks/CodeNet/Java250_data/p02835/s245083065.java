import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = 0;
		for (int i = 0; i < 3; i++) {
			a += scanner.nextInt();
		}
		if (a >= 22) {
			System.out.println("bust");
		} else {
			System.out.println("win");
		}
	}

}
