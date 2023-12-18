
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		String s = in.nextLine();

		if(n==1 || n % 2 == 1) {
			System.out.println("No");
			return;
		}
		for(int i = 0; i < n/2; i++) {
			if(s.charAt(i) != s.charAt(n/2 + i)) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}