import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int x;
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		for (int counter = 1; counter <= x; counter = counter + 3) {
			System.out.print(" " + counter);
		}
	}
}