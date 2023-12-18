import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, a, b;
		x = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		x = x - a;
		if (x == 0)
			System.out.println(0);
		else {
			while (x > 0) {
				x -= b;
			}
			if(x < 0)
				System.out.println(x + b);
			else
				System.out.println(x);
		}
	}

}
