import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		sc.close();

		int x = 0;

		if(a == b) {
			x = c;
		}
		if(a == c) {
			x = b;
		}
		if(b == c) {
			x = a;
		}

		System.out.println(x);


	}


}
