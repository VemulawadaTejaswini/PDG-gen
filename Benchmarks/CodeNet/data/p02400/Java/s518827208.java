import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		System.out.println(String.format("%.5f",Math.pow(r, 2) * Math.PI) + " " + String.format("%.5f",r * 2 * Math.PI));
	}
}