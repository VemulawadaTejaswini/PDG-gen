import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int c1 = a + b;
		int c2 = a - b;
		int c3 = a * b;

		int c=Math.max(c1, c2);
		int d=Math.max(c, c3);
		
		System.out.println(d);
		sc.close();
	}
}