import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();
		System.out.println((int)Math.min(B, D) - (int)Math.max(A, C) >= 0 ? (int)Math.min(B, D) - (int)Math.max(A, C) : 0);
		scan.close();

	}

}
