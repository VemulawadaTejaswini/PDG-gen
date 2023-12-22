import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int count5 = 0;
		int count7 = 0;
		switch (a) {
		case 5:
			count5++;
			break;
		case 7:
			count7++;
			break;
		default:
			break;
		}
		switch (b) {
		case 5:
			count5++;
			break;
		case 7:
			count7++;
			break;
		default:
			break;
		}
		switch (c) {
		case 5:
			count5++;
			break;
		case 7:
			count7++;
			break;
		default:
			break;
		}
		if (2 == count5 && 1 == count7) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
