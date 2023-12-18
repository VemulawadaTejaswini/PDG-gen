import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		int a = 0,b = 0;
		double x = 0;

		a = sc.nextInt();
		b = sc.nextInt();

		x = a * b;
		x = x % 2;

		if(x == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}

	}
}
