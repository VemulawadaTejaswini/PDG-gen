import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		double r = stdIn.nextDouble();
		
		System.out.printf("%.6f %.6f\n",(r * r * Math.PI),(2 * r * Math.PI)); 
	}

}