import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Input are two integers separated from a space
		int x = input.nextInt();
		int y = input.nextInt();
		// Need to see if there's a clean division or remainder
		int r = 0;
		
		// Start with simple case, they equal
		if (x == y) { System.out.println(x);}
		else if (x >= y) {
			while (x % y > 0) {
				r = x % y;
				x = y;
				y = r;
			}
			System.out.println(r);
		}
		else {
			while (y%x >0) {
				r = y % x;
				y = x;
				x = r;
			}
			System.out.println(r);
		}

	}

}

