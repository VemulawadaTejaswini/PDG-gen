import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

import java.io.PrintWriter;

public class Main {
	public static long MOD = 1000000007L;
	public static void main(String[] args) {
		int i=0,j=0,k=0;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int m = parseInt(sc.next());
		sc.close();
		if(abs(n-m)>1) {
			out.println(0);
			return;
		}
		int mx = Math.max(n, m);
		long[] fa = new long[mx+1];
		fa[0] = fa[1] = 1L;
		for(i=2;i<=mx;i++) {
			fa[i] = i*fa[i-1];
			if(fa[i] >= MOD)fa[i]%=MOD;
		}
		out.println(m==n?(fa[n]*fa[m]*2)%MOD:(fa[n]*fa[m])%MOD);
	}
}
