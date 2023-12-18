import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		String ans = "Yay!";
		
		if (a + b > 16 || a > 8 || b > 8) {
			ans = ":(";
		}
		System.out.println(ans);
	}
}
