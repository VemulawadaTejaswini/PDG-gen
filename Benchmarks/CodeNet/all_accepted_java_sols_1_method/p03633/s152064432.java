import java.util.*;
import java.math.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		BigInteger n=new BigInteger("105");
		BigInteger []a=new BigInteger[n.intValue()];
		int t=scan.nextInt();
		for(int i=0;i<t;i++){
		    a[i]=scan.nextBigInteger();
		}
		BigInteger ans=a[0];
		for(int i=1;i<t;i++){
		    BigInteger k=ans.multiply(a[i]);
		    BigInteger g=ans.gcd(a[i]);
		    ans=k.divide(g);
		}
		System.out.println(ans);
	}
}
