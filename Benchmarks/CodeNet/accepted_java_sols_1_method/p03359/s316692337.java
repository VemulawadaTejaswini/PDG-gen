import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int num = 0;

		if (a <= b) {
			num = a;
		} else {
			num = a-1;
		}

		System.out.println(num);

		scan.close();

	}

}
