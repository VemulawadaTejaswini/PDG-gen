import java.util.Scanner;


public class Main {
	public static void main (String args[]) throws Exception{
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int x = scan.nextInt();
		int t = scan.nextInt();
		int temp = 0;
		if(n % x != 0 ) {
			temp = 1;
		}

		System.out.print(((n / x) + temp) * t);
	}
}