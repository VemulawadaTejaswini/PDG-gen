import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String str = scan.next();
		
		if (str.substring(0, n / 2).equals(str.substring(n / 2, n))) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		scan.close();
	}
}