import java.util.Scanner;

public class Main {
	
	public static int gcd(int first, int second) {
	    if(second == 0) {
	        return first;
	    }
		return gcd(second, first % second);
	}

	public static void main(String[] args) {
		// user input line here
		Scanner sc = new Scanner(System.in);
		// pull numbers
		int first = sc.nextInt();
		int second = sc.nextInt();
		// print the result of gcd() with inputted numbers
		int exp = (int) Math.pow(10, 9);
		if(first>=1 && second <= exp) {
			System.out.println(gcd(first, second));
		}
	}

}

