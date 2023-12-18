import java.util.Scanner;

class Main {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int d = x / y;
		int r = x % y;
		double a = x;
		double b = y;
		System.out.println(x/y + " " + x%y + " " + 1.0*a/b);
	}
}