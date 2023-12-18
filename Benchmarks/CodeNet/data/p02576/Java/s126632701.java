import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		int t = scan.nextInt();
		int a;

		if(n % x ==0) {
			a = n / x;
		}else {
			a = n / x + 1;
		}
		System.out.println(a * t);
	}
}
