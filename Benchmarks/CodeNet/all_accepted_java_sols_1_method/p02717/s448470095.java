import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		sc.close();
		int a = Y;
		int b = X;
		int c = a;
		a = Z;
		System.out.println(a + " " + b + " " + c);
	}
}
