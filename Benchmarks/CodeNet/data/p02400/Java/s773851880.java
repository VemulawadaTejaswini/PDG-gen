import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		circle();

	}
	
	public static void circle() {
		
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		
		System.out.println(String.format("%.8f" , r * r * Math.PI) + " " + String.format("%.8f" , 2 * r * Math.PI));
	}
}
