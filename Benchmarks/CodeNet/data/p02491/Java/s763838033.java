import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		double d = (double) x /  (double) y;
		
		System.out.println((x / y) + " " + (x % y) + " " + d);
	}
}