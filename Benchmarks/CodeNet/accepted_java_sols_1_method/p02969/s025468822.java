import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int ans = 3 * (int)Math.pow(r, 2);
		System.out.println(ans);
	}
}
