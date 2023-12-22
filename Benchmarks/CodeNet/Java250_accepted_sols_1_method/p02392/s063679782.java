import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte a = sc.nextByte();
		byte b = sc.nextByte();
		byte c = sc.nextByte();
		if (a < b && b < c) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}

}
