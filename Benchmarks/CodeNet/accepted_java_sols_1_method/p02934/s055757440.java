import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double denominator = 0;
		for ( int i = 0; i < n; i++ ) {
			double temp = (double)in.nextInt();
			denominator += 1.0/temp;
		}
		
		System.out.println(1.0/denominator);

		in.close();
	}
}