import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();

		int a = 0,b = 0,c = 0;

		a = y;
		b = x;

		c = a;
		a = z;


		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		scan.close();

	}

}
