import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a < -1000 || b > 1001) {
			System.err.println("Err!");	
			return;
		}
		
		if (a < b) {
			System.out.println("a < b");	
		} else if (a > b) {
			System.out.println("a > b");			
		} else if (a == b) {
			System.out.println("a == b");
		}
	}
}
