import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		if (a == 1) {
			a = 14;
		}
		if (b == 1) {
			b = 14;
		}
		
		if (a < b) {
			System.out.println("Bob");
		} else if (a > b) {
			System.out.println("Alice");
		} else {
			System.out.println("Draw");
		}
	}
}