import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		long p = scn.nextLong(), q = scn.nextLong();
		scn.close();
		long qs;
		long ans = q;

		long bp = p,bq = q,buf = p;

		while(bq % bp != 0) {
			buf = bq % bp;
			bq = bp;
			bp = buf;
		}

		for(int i = 2;i <= Math.sqrt(q);i++) {
			for(int j = 1;j <= buf;j++) {
				if(p%j == 0 && q %j == 0) {
					qs = q/j;
					while(qs % i == 0) {
						qs /= i;
					}
					if(qs == 1) {
						ans = i;
						break;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
