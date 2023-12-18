

import java.util.*;
import java.math.*;
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
	static final long mod = (int) (1e9 + 7);
	static final int inf = (int) (1e9);
	static final int maxn = (int) (1e5 + 10);

	static int n, q;
	static String s;
	static long[][][][] dp = new long[110][5][5][5];
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int h=cin.nextInt();int w=cin.nextInt();
		int a=cin.nextInt(),b=cin.nextInt();
		int ans=h*w-w*a-(h-a)*b;
		System.out.println(ans);
	}
}