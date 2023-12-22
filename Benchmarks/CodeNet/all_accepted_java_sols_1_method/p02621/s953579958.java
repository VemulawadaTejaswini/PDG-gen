import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int pow2a = a * a;
		int pow3a = pow2a * a;
		int ans = a + pow2a + pow3a;

		System.out.println(ans);
	}
}
