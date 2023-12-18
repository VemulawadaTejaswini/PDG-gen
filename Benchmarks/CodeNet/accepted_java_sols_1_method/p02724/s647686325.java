import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long X = scanner.nextLong();
		
		long sho1 = X / 500;
		long amari1 = X % 500;
		long sho2 = amari1 / 5;
		
		long happy = sho1 * 1000 + sho2 * 5;
		
		System.out.println(happy);
	}
}
