import java.util.Scanner;

public class Main{

	public static int gcd(int x, int y) {

		int z = x % y;

		if (z == 0) {
			return y;
		} else {
			return(gcd(y,z));
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();

		System.out.println(gcd(x,y));

	}

}

