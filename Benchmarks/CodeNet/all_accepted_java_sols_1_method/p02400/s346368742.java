import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double r = scanner.nextDouble();
		scanner.close();
		
		System.out.print(String.format("%.5f", r * r * Math.PI) + " " + String.format("%.5f", 2 * r * Math.PI));
	}
} 

