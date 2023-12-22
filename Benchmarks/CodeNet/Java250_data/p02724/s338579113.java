import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int X = scan.nextInt();
		int c500 = X / 500;
		X %= 500;
		int c5 = X / 5;

		System.out.println(1000*c500 + 5*c5);

	}

}