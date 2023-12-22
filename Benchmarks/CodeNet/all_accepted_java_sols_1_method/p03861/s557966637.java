import java.util.Scanner;

class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		long a, b, x;
		a = scan.nextLong();
		b = scan.nextLong();
		x = scan.nextLong();
		
		long low, high;
		low = (a % x == 0 ? a / x : a / x + 1);
		high = b / x;
		
		System.out.println(high - low + 1 >= 0 ? high - low + 1: 0);
		
	}
}