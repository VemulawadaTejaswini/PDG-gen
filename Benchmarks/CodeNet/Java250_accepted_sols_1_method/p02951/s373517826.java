import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int remnant = a - b;

		c -= remnant;
		c = c < 0 ? 0 : c;

		System.out.println(c);

	}
}
