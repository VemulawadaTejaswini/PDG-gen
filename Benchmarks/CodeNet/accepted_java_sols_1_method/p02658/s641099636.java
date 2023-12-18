import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] as = new long[n];
		for(int i=0; i<n; i++){
			as[i] = sc.nextLong();
			if(as[i] == 0) {
				System.out.println(0);
				return;
			}
		}
		BigInteger ans = new BigInteger("1");
		BigInteger hikaku = new BigInteger("1000000000000000000");
		for(int i=0; i<n; i++){
			String str = String.valueOf(as[i]);
			BigInteger a = new BigInteger(str);
			ans = ans.multiply(a);
			if(ans.compareTo(hikaku) == 1){
				System.out.println(-1);
				return;
			}
		}	
		System.out.println(ans);
	}
}
