import java.util.Scanner;


public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		long y;
		n = scan.nextInt();
		y = 1;
		for (int i = n; i > 1; i--) {
			y *= i;
		}
		System.out.println(y);
	}

}