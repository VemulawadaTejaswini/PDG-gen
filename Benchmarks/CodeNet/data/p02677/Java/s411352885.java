import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int H = scan.nextInt();
		int M = scan.nextInt();
		
		double jisin = (double)H /12 + (double)M / 60 / 12;
		double funsin = (double)M / 60;
		
		double kakudo = Math.PI * 2 * (jisin - funsin);
		double C = Math.sqrt(A*A+B*B-2*A*B*Math.cos(kakudo));
		
		System.out.println(C);

	}

}