import java.util.*;
import java.math.*;
class Main{
	static BigInteger rjk(BigInteger a,int b){
		BigInteger L=BigInteger.ZERO;
		BigInteger R=a.abs().add(BigInteger.ONE);
		while(R.compareTo(L.add(BigInteger.ONE))>0){
			BigInteger M=L.add(R).divide(BigInteger.valueOf(2));
		//	System.out.println(a.toString()+" "+M.pow(b).toString());
			if(a.compareTo(M.pow(b))<0)R=M;
			else L=M;
		}
		return L;
	}
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		while(true){
			int n=s.nextInt();
			if(n==0)System.exit(0);
			long c[]=new long[n];
			int ind=0;
			BigInteger K1=BigInteger.ONE;
			BigInteger K2=BigInteger.ONE;
			for(int i=0;i<n*(n+1)/2;i++){
				long b=s.nextLong();
				if(b%2==0){
					c[ind++]=b;
					K1=K1.multiply(BigInteger.valueOf(b));
				}
				K2=K2.multiply(BigInteger.valueOf(b));
			}
		//	System.out.println(K1.toString());
			K2=rjk(K2,n);

			K1=rjk(K1.divide(K2),n-1);
			//System.out.println(K1.toString());
			int g=K1.intValue();
			Arrays.sort(c);
			System.out.println(g);
			for(int i=0;i<n;i++){
				if(i>0)System.out.print(" ");
				System.out.print(c[i]/g);
			}
			System.out.println();
		}
	}
}