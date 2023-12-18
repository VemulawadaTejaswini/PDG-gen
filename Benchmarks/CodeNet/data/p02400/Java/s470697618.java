import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		System.out.println(String.format("%8f", r * r * Math.PI) + " " + String.format("%8f", 2 * r * Math.PI));
	}
}
