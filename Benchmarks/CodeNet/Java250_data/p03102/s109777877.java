

import java.util.*;
import java.math.*;
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
	static final long mod = (int) (1e9 + 7);
	static final int inf = (int) (1e9);
	static final int maxn = (int) (1e5 + 10);

	static int n, m,c;
	static String s;
	static int[][] a=new int [22][22];
	static int [] b=new int[22];
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		n=cin.nextInt();m=cin.nextInt();c=cin.nextInt();
		for(int i=1;i<=m;i++) {
			b[i]=cin.nextInt();
		}
		int sum=0,ans=0;
		for(int i=1;i<=n;i++) {
			sum=c;
			for(int j=1;j<=m;j++) {
				a[i][j]=cin.nextInt();
				sum+=a[i][j]*b[j];
			}
			if(sum>0) ans++;
		}
		System.out.println(ans);
	}
}