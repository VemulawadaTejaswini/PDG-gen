import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int x, y;
		x = scanner.nextInt();
		y = scanner.nextInt();
		System.out.print(x/y + " " + x%y + " ");
		System.out.printf("%5.5f\n", 1.0*x/y);
		scanner.close();
	}
}