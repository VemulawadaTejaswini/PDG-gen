
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A= sc.nextLong();
		long B = sc.nextLong();
		long N = sc.nextLong();
		if (N==1) {
			System.out.println(A/B-A*(1/B));
			return ;
		}
		if (N>=B) {
			System.out.println(A*(B-1)/B-A*((B-1)/B));
		} else {
			System.out.println(A*N/B-A*(N/B));
		}
	}
}