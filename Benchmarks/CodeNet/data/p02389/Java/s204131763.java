import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter(" ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int x = a*b;
		int y = 2*a + 2*b;
		System.out.println(x+ " "+ y);
	}
}