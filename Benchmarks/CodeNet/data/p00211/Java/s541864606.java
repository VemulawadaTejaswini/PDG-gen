import java.math.*;
import java.util.*;

class Main{
	static BigInteger lcm(BigInteger a,BigInteger b){
		return a.multiply(b).divide(a.gcd(b));
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			BigInteger[] ds=new BigInteger[n];
			BigInteger[] vs=new BigInteger[n];
			for(int i=0;i<n;i++){
				ds[i]=sc.nextBigInteger();
				vs[i]=sc.nextBigInteger();
			}
			
			BigInteger den=BigInteger.ONE;
			for(int i=0;i<n;i++)
				den=lcm(den,vs[i]);
			BigInteger num=BigInteger.ONE;
			for(int i=0;i<n;i++)
				num=lcm(num,ds[i].multiply(den.divide(vs[i])));
			
			for(int i=0;i<n;i++){
				// num/ds[i]/(den/vs[i])
				BigInteger x=num.divide(ds[i]).divide(den.divide(vs[i]));
				System.out.println(x);
			}
		}
	}
}