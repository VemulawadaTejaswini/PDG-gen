import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		double sum = new Scanner(System.in).nextDouble();
		
		System.out.println(Math.pow(sum / 3, 3));
		
	}
	
}