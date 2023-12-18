import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int g = scan.nextInt();
		int b = 2*g-r;
		System.out.println(b);
	}
}
