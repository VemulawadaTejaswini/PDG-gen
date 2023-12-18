import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(args[0]);
		int x = scan.nextInt();
		x = x*x*x;
		System.out.println(x);
	}
}