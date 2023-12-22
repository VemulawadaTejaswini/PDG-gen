import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int res = 0;

		//400<=X<=1999
		res = 10 - x / 200;


		System.out.printf("%d", res);
	}
}
