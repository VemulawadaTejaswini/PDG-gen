import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int xa = Math.abs(a-x);
		int xb = Math.abs(b-x);
		
		String ans = "B";
		if (xa<xb) {
			ans="A";
		}
		System.out.println(ans);
		
		scanner.close();
	}

}
