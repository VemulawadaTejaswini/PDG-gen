import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int count = 0;

		if( B - A * C >= 0) {
			count = C;
			System.out.println(count);
		}
		if(B - A * C < 0 && B >= A) {
			count = B / A;
			System.out.println(count);
		}
		if(B - A * C < 0 && B < A) {
			count = 0;
			System.out.println(count);
		}
	}

}
