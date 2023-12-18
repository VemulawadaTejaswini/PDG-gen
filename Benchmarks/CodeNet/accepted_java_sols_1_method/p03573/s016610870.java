
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		if(A == B) {
			System.out.println(C);
		} else if(A == C) {
			System.out.println(B);
		} else if(B == C) {
			System.out.println(A);
		}
		scan.close();

	}

}
