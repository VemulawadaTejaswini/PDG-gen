import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();

		if(N%K == 0) {
			System.out.println(0);
		} else {
			long remainder = N%K;
			long diff = Math.abs(remainder-K);
			System.out.println(Math.min(remainder, diff));
		}
	}
}