import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		String in = scan.next();
		int a = Integer.parseInt(in);
		
		in = scan.next();
		int b = Integer.parseInt(in);
		
		if (a < b) {
			System.out.println("a < b");
		} else if (a > b) {
			System.out.println("a > b");
		} else {
			System.out.println("a == b");
		}
	}
}