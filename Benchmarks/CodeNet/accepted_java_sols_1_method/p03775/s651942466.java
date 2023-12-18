
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		sc.close();
		int min = Long.toString(N).length();
		for(long i = 2; i * i <= N; i++) {
			if(N % i == 0) {
				min = Math.min(min, Long.toString(N / i).length());
			}
		}
		System.out.println(min);
	}
}