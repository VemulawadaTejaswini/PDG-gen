import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			System.out.println("Case " + (i + 1) + ":");
			for (int j = 0; j < 10; j++) {
				a = a * a;
				a %= 1000000;
				a /= 100;
				System.out.println(a);
			}
		}
	}
}