import java.util.Scanner;

public class Main {
	
	public static int gcd(int x, int y) {
		if(y == 0 ) {
			return x;
		}
		else {
			return gcd(y, x % y);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int firstNum = in.nextInt();
		int secondNum = in.nextInt();
		System.out.println(gcd(firstNum, secondNum));
		in.close();
	}
}

