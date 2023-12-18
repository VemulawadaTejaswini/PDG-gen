import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int c = 0;

		try (Scanner scanner = new Scanner(System.in)) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
		}

		if(c<b) {
			int d =b;
			c=b;
			c=d;
		}

		if(b<a) {
			int d=a;
			b=a;
			b=d;
		}

		if(c<b) {
			int d =b;
			c=b;
			c=d;
		}

		System.out.println(a+""+b+""+c);
		
	}

}