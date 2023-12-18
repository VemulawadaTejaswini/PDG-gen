import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	Scanner cin;
	int n;
	int[] o;
	void run() {
		cin = new Scanner(new BufferedInputStream(System.in));
		int xx = 0;
		while(true) {
			n = cin.nextInt();
			if (n == 0) return;
			++ xx;
			if (xx == 5) return;
			o = new int[n];
			for(int i = 0; i < n; ++ i) {
				o[i] = cin.nextInt();
			}
			int rs = -1, ra = -1, rc = -1;
			BigInteger ret = BigInteger.ZERO;
			for(int s = 0; s < 16; ++ s) {
				for(int a = 0; a < 16; ++ a) {
					for(int b = 0; b < 16; ++ b) {
						int[] cnt = new int[256];
						for(int i = 0; i < 256; ++ i) cnt[i] = 0;
						int cur = s;
						for(int i = 0; i < n; ++ i) {
							cur = (cur * a + b) % 256;
							int x = (o[i] + cur) % 256;
							++ cnt[x];
						}

						BigInteger tmp = BigInteger.ONE;
						for(int i = 0; i < 256; ++ i) {
							tmp = tmp.multiply((BigInteger.valueOf(cnt[i])).pow(cnt[i]));
						}
						if (tmp.compareTo(ret) > 0) {
							ret = tmp;
							rs = s;
							ra = a;
							rc = b;
						}
					}
				}
			}
			System.out.println(rs + " " + ra + " " + rc);
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}