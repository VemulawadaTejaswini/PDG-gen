import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		System.out.println((Math.pow(r, 2) * Math.PI) + " " + (r * 2 * Math.PI));
	}
}