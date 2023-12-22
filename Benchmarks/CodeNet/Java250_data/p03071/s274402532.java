import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();

		int result = 0;

		if(A == B) {
			result = A + B;
		}else if(A >B) {
			result = A + A - 1;
		}else if(B>A) {
			result = B + B -1;
		}
		System.out.println(result);





	}
}
