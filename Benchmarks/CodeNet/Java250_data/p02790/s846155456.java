import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();

		boolean aFlag = false;

		if (a < b) {
			aFlag = true;
		} else {
			aFlag = false;
		}

		if (aFlag) {
			for (int i = 0; i < b; i++) {
				System.out.print(a);
			}
		} else {
			for (int i = 0; i < a; i++) {
				System.out.print(b);
			}
		}

	}

}
