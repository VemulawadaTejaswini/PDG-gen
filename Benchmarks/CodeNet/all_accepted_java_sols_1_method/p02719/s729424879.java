import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		long K = sc.nextLong();
		
		long min = N;
		if (N >= K) {
			min = N % K;
		}
		
		if (min > K / 2.0) {
			min = Math.abs(min - K);
		}
		
		System.out.println(min);
		
	}
}