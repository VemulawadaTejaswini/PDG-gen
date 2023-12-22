import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long X = stdIn.nextLong();
		long num500 = X / 500;
		long num5 = (X % 500) / 5;
		System.out.println(num500 * 1000 + num5 * 5);
	}
}