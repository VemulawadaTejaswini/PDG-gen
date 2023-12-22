import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double r = scan.nextDouble();
		
		System.out.print(String.format("%.6f", r * r * Math.PI));
		System.out.println(" "+ String.format("%.6f",2 * r * Math.PI));
		
	}
}
