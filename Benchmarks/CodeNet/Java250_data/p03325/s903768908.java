import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long []a = new long[N];
		for(int i = 0; i < N; i++) {
			a[i] = scan.nextLong();
		}
		scan.close();

		long p = 0;
		for(int i = 0; i < N; i++) {
			p += num2(a[i]);
		}

		if(p == 0) {
			System.out.println(0);
		}else {
			System.out.println(p - N);
		}

	}
	public static int num2(long n) {
		for(int i = 1; i < 10000; i++) {
			long t = (long)Math.pow(2, i);
			if(n % t != 0) {
				return i;
			}
		}
		return 0;
	}
}