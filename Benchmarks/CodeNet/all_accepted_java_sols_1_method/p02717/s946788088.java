import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int w = 0;
		w = a;
		a = b;
		b = w;
		w = a;
		a = c;
		c = w;
		System.out.println(a + " " + b + " " + c);
	}
}