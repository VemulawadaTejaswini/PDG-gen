import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();

		if (1 <= A && A <= 100) {
			if(1 <= B && B <= 100) {
				int ans = A * B;
				System.out.println(ans);
			}
		}
		scan.close();




	}

}
