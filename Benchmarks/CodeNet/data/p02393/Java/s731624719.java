import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int temp;
		
		do {
			if (a > b) { temp = a; a = b; b = temp; }
			if (b > c) { temp = b; b = c; c = temp; }
		} while (!(a < b && b < c));
		
		System.out.println(a + " " + b + " " + c);
	}
}