import java.util.Scanner;

class Main {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		double f = 1.0 * x / y;
		System.out.println(x/y + " " + x%y + " " + f);
	}
}