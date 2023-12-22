import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scan.nextInt();
		
		if(n % 2 == 0) {
			System.out.println(n);
		} else {
			System.out.println(2 * n);
		}
    }
}
