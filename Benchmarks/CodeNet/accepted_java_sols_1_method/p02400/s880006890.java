import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in);){
			double r = sc.nextDouble();
			
			System.out.format("%.6f %.6f\n", r * r * Math.PI, 2 * Math.PI * r);
		}
	}
}

