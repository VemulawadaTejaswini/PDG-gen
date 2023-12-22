import java.util.Scanner;

public class Main{
	static long a;
	static long b;
	static long x;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long l = scan.nextLong();
		long r = scan.nextLong();

		if(r - l > 2020) {
			r = l + 2020;
		}

		long ans = Long.MAX_VALUE;
		for(long i = l; i <= r - 1; i++) {
			for(long j = i + 1; j <= r; j++) {
				if(ans > ((i % 2019) * j) % 2019) {
					ans = ((i % 2019) * j) % 2019;
				}
			}
		}
		System.out.println(ans);
	}
}
