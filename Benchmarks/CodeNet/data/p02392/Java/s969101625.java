import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		range();

	}
	
	public static void range() {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a < b && b < c) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
