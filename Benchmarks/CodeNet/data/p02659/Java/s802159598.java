import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double N = scan.nextDouble();
		double K = scan.nextDouble();
		
		double B  = N*K;
		long C = (long)B;
		System.out.println(C);
		

	}

}
