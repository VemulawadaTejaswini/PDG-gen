import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	 	Scanner scanner = new Scanner(System.in);
	 	int N = scanner.nextInt();
	 	int a = 0;
	 	int b = 0;
	 	int c = 0;
	 	int d = 0;

	 	a = N / 100;
	 	d = N % 100;
	 	b = d / 10;
	 	c = d % 10;
//	 	System.out.println(a);
//	 	System.out.println(b);
//	 	System.out.println(c);

	 	if (a == 7 || b == 7 || c == 7) {
	 		System.out.println("Yes");
	 	} else {
	 		System.out.println("No");
	 	}
 	}
}
