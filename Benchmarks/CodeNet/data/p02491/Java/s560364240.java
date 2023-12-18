import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		float d = (float) x /  (float) y;
		
		System.out.println((x / y) + " " + (x % y) + " " + d);
	}
}