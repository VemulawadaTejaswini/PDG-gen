
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		if(a != b && b != c && c != a) {
			System.out.println("No");
		} else if(a == b && b == c) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}

	}

}
