import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		long p = scn.nextLong(), q = scn.nextLong();
		scn.close();
		long qs;
		long ans = q;
		for(int i = 2;i <= q;i++) {
			for(int j = 1;j <= p;j++) {
				if(p%j == 0 && q %j == 0) {
					qs = q/j;
					while(qs % i == 0) {
						qs /= i;
					}
					if(qs == 1)ans = Math.min(i,ans);
				}
			}
		}
		System.out.println(ans);
	}
}
