
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		sc.close();
		int n = Integer.parseInt(a + b);
		int root = (int) Math.sqrt(n);
		if (root * root == n) {
			System.out.println("Yes");
			return;
		}
		System.out.println("No");
	}

}
