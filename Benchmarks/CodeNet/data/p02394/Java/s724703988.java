import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte W = sc.nextByte();
		byte H = sc.nextByte();
		byte x = sc.nextByte();
		byte y = sc.nextByte();
		byte r = sc.nextByte();
		if (x - r >= 0 && x + r <= W && y - r >= 0 && y + r <= H) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}

}
