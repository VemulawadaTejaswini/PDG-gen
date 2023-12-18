import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
 		int A = scanner.nextInt();
 		int B = scanner.nextInt();
 		if (2*B >= A ) {
 			System.out.println("0");
 		} else {
 			System.out.println(A - 2*B);
 		}
	}
}
