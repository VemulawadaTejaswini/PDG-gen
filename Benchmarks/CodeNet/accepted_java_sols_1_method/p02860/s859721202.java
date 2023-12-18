import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		String S = scan.next();
		
		if (S.substring(0, N /2).equals(S.substring(N /2))) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}