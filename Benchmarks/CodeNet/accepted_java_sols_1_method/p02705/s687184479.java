import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double r = scanner.nextDouble();
		
		scanner.close();
		
		System.out.println(2 * r * 3.14);
	}

}
