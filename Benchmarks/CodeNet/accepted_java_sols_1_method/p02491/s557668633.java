import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		
		int div_i = x / y;
		int ex = x % y;
		double div_d = (double)x / y;
		
		System.out.printf("%d %d %.5f\n", div_i, ex, div_d);
	}

}