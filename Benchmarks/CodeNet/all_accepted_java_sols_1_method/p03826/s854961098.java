import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();
		if(A * B > C * D) {
			System.out.println(A * B);
		} else {
			System.out.println(C * D);
		}
		scan.close();

	}

}
