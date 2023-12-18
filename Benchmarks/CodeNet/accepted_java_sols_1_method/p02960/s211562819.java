import java.util.*;
public class Main {
	public static long mod;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		final int mod = (int)Math.pow(10,9)+7;
		final int N = 13;
		int r[] = new int[N];
		r[0]=1;
		int mul=1;
		for(int i=S.length()-1;i>=0;i--) {
			int nextr[]=new int[N];
			char tmp = S.charAt(i);
			if(tmp =='?') {
				for(int k=0;k<=9;k++) {
					int tmpnmod = k*mul%N;

					for(int j=0;j<N;j++) {
						int next = (j + tmpnmod)%N;
						nextr[next]+=r[j];
						nextr[next]%=mod;
					}
				}
			}else {
				int tmpn = tmp - '0'; 
				int tmpnmod = tmpn*mul%N;
				for(int j=0;j<N;j++) {
					int next = (j+tmpnmod)%N;
					nextr[next]=r[j];
				}
			}
			r = nextr;
			mul *= 10;
			mul %= mod;
			mul %= N;
		}
		System.out.println(r[5]);
	}
}
