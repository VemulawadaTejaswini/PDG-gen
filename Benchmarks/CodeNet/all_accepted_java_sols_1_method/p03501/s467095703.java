import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		int A=scan.nextInt();
		int B=scan.nextInt();
		if(B<A*N) {
			System.out.println(B);
		} else {
			System.out.println(A*N);
		}
	}
}