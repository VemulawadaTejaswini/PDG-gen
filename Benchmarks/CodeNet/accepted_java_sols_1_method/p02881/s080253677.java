import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();

		long N = (long)Math.sqrt(n);
		long i;
		long min = Long.MAX_VALUE;
		for(i = 1; i <= N; i++) {
			if(n % i == 0) {
				if(i + (n / i) < min)
					min = i + (n / i);
			}
		}

		System.out.println(min - 2);
	}
}