import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfBook = sc.nextInt();

		int output = numberOfBook % 10;

		switch (output) {
			case 0:
				System.out.println("pon");
				break;
			case 1:
				System.out.println("pon");
				break;
			case 2:
				System.out.println("hon");
				break;
			case 3:
				System.out.println("bon");
				break;
			case 4:
				System.out.println("hon");
				break;
			case 5:
				System.out.println("hon");
				break;
			case 6:
				System.out.println("pon");
				break;
			case 7:
				System.out.println("hon");
				break;
			case 8:
				System.out.println("pon");
				break;
			case 9:
				System.out.println("hon");
				break;

		}

	}
}