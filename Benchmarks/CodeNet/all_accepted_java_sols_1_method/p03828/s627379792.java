import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final long MOD = 1000000007;
	public static void main(String[] args) {
		int i=0,j=0,k=0;
		Scanner sc = new Scanner(in);
		long n = parseLong(sc.next());
		sc.close();
		HashMap<Integer,Long> pri = new HashMap<>();
		for(i=2;i<=n;i++) {
			int tmp=i;
			j=2;
			while(tmp%j==0) {
				tmp/=j;
				if(pri.get(j)==null) {
					pri.put(j, 1L);
				} else {
					pri.put(j,pri.get(j)+1L);
				}
			}
			for(j=3;j*j<=i;j+=2) {
				while(tmp%j==0) {
					tmp/=j;
					if(pri.get(j)==null) {
						pri.put(j, 1L);
					} else {
						pri.put(j,pri.get(j)+1L);
					}
				}
			}
			if(tmp!=1) {
				if(pri.get(tmp)==null) {
					pri.put(tmp, 1L);
				} else {
					pri.put(tmp,pri.get(tmp)+1L);
				}
			}
		}
		long ans=1;
		for (Integer ii: pri.keySet()) {
//			out.printf("%d:%d%n",ii,pri.get(ii));
			ans *= (pri.get(ii)+1L);
			if(ans>=MOD)ans%=MOD;
		}
		out.println(ans);
	}
}
