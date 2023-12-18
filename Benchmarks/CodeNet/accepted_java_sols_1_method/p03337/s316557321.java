import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int a,b;
		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();

		int ca = a + b;
		int cb = a - b;
		int cc = a * b;
		
		int ans = Math.max(ca, Math.max(cb, cc));
			System.out.println(ans);
	}
}
