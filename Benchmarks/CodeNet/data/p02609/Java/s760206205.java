import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);

		 long n = s.nextLong();
		 String x = s.next();

		 for(long i = 0; i < n; i++) {

			Double tmpD = Math.pow(2,  n - i - 1);
			long tmp = tmpD.longValue();

			long longX = Long.parseLong(x, 2);
			long work = longX ^ tmp;
			if (work == 0 ) {
				System.out.println(0);
			} else {
				System.out.println(func(work, 0));
			}
		 }
	}

	private static long  func(long n, long cnt) {
		long bitCnt = Long.bitCount(n);

		long tmp = n % bitCnt;

		cnt++;
		if(tmp == 0) {
			return cnt;
		} else {
			return func(tmp, cnt);
		}
	}
}