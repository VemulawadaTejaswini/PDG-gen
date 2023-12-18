import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);

		int one = stdin.nextInt();
		int five = stdin.nextInt() * 5;
		int ten = stdin.nextInt() * 10;
		int fifty = stdin.nextInt() * 50;
		int onehundred = stdin.nextInt() * 100;
		int fivehundred = stdin.nextInt() * 500;

		if((one + five + ten + fifty + onehundred + fivehundred) >= 1000) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}




	}
}