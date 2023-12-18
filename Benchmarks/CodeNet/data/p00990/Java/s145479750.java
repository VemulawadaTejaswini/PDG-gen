import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
     
     
public class Main {
	static int W;
	static int H;
	static int N;
	static boolean[][] fld;
	static int[] vx = new int[] {0,1,0,-1};
	static int[] vy = new int[] {1,0,-1,0};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		String in = sc.next();
		for(int i = 0; i < n; i++) {
			if(in.charAt(i) == '*') {
				num[i] = -1;
			}
			else {
				num[i] = in.charAt(i) - '0';
			}
		}
		int m = sc.nextInt();
		int[] c = new int[m];
		for(int i = 0; i < m; i++) {
			c[i] = sc.nextInt();
		}
		int ans = dfs(0,num,c);
		System.out.println(ans);
	}
	static int dfs(int now, int[] num, int[] c) {
		if(now == num.length) {
			return check(num)?1:0;
		}
		if(num[now] != -1) return dfs(now+1,num,c);
		int ret = 0;
		for(int i = 0; i < c.length; i++) {
			num[now] = c[i];
			ret += dfs(now+1,num,c);
		}
		num[now] = -1;
		return ret;
	}
	static boolean check(int[] a) {
		int sum = 0;
		for(int i = a.length-1; i >= 0; i--) {
			if((a.length - i) % 2 == 0) {
				int tmp = a[i]*2;
				if(tmp >= 10) {
					String v = String.valueOf(tmp);
					tmp = v.charAt(0) - '0' + v.charAt(1) - '0';
				}
				sum += tmp;
			}
			else {
				
				sum += a[i];
			}
		}
		return sum % 10 == 0;
	}
}