import java.util.Scanner;

class Main {

	public static final double PI = 3.14159;

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int r = stdIn.nextInt();
		final double one = 1 * 1 * PI;
		final double s = r * r * PI;
		System.out.println((int)(s / one));
	}
	
}