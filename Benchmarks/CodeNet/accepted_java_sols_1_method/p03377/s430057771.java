import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();

		if (a > x){
			System.out.println("NO");
		} else if (a + b < x){
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}
