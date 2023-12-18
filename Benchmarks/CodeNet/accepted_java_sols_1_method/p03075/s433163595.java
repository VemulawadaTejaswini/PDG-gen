import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		byte a = scanner.nextByte();
		scanner.nextByte();
		scanner.nextByte();
		scanner.nextByte();
		byte e = scanner.nextByte();
		byte k = scanner.nextByte();

		if (e-a>k) System.out.println(":(");
		else System.out.println("Yay!");
	}
}