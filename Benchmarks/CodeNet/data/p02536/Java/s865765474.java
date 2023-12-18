import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		
		if((a<=c&&c<=b) || (c<=a&&a<=d)) {
			System.out.println("Yes");
		}
		else if((a<=d&&d<=b) || (c<=b&&b<=d)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}
}
