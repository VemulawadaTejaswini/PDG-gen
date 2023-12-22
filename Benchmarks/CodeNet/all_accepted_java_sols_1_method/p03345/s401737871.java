import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long K = sc.nextLong();
		if (K%2==0) {
			System.out.println(A-B);
		} else {
			System.out.println(B-A);
		}
	}
}