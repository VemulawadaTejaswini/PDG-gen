import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		float T, X, ans;
		
		T = scanner.nextInt();
		X = scanner.nextInt();
		
		ans = T/X;
		
		System.out.print(ans);
	}
}
