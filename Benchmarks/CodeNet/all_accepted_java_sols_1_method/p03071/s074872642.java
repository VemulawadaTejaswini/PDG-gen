import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int sum;

		if( A <= B -1) {
			sum = 2 * B - 1;
		}else if( A < B + 1 && A > B - 1) {
			sum = A + B;
		}else {
			sum = 2 * A - 1;
		}

		System.out.println(sum);
	}

}