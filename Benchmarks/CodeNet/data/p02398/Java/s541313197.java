import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		int divisor = 0;

		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

		for (int i = a; i < b; i++)
			if (c % i == 0)divisor++;
		
		System.out.printf("%d\n", divisor);
	}
}