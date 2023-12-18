import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double r;
		
		Scanner scan = new Scanner(System.in);
		
		r = scan.nextDouble();
		
		System.out.printf("%f " , r * r * Math.PI);
		System.out.printf("%f" , r * 2 * Math.PI);
		
	}

}
