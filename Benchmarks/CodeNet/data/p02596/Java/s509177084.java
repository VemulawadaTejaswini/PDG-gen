

import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[] ans=new int[1000005];
		for(int i=0;i<1000000;i++) {
			if(i%10==5 || i%2==0) {
				ans[i]=-1;
				continue;
			}
			int T=i;
			BigInteger a1=BigInteger.valueOf(7);
			BigInteger a2=a1;
			int count=1;
			BigInteger a3=BigInteger.valueOf(T);
			while(a1.mod(a3).compareTo(BigInteger.ZERO)!=0) {
				count++;
				a1=a1.multiply(BigInteger.TEN).add(BigInteger.valueOf(7));
			}
			ans[i]=count;
		}
		while(in.hasNext()) {
			System.out.println(ans[in.nextInt()]);
		}
	}
}
