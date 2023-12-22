import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long K = sc.nextLong();
		if (K>=A) {
			System.out.print(0);
			System.out.print(" ");
			K-=A;
			if (B>=K) {
				System.out.println(B-K);
			} else {
				System.out.print(0);
			}
		} else {
			System.out.print(A-K);
			System.out.print(" ");
			System.out.print(B);
		}
	}
}
