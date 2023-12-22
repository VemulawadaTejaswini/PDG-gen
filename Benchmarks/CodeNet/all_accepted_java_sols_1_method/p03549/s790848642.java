import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		long mt = 1900, at = 100;
		double db = Math.pow(2, M);
		double pre = 1/db;
		double dpre = (db-1)/db;
		long d_time = at * (N-M) + mt * M;
		long time = d_time;
		double ans = 0;
		while(pre > 0.00000000001) {
			pre *= dpre;
			time += d_time;
		}
		while(pre < 1/db + 0.0000001) {
			ans += pre * time;
			time-=d_time;
			pre/=dpre;
		}
		if((long)ans % 100 == 1)ans--;
		if((long)ans % 100 == 99)ans++;
		System.out.println((long)ans);

	}

}
