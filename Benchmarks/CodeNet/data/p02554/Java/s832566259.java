import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double n = scan.nextDouble();

		if(n == 1) {
			System.out.println(0);
		} else if(n == 2) {
			System.out.println(2);
		} else {
			double i = (n*(n-1)*Math.pow(9, n-2)) % (Math.pow(10, 7)+7) ;
			System.out.println(i);
		}


	}
}