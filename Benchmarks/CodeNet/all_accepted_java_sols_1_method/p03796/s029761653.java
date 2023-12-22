import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		BigInteger a=new BigInteger("1");
		
		BigInteger b=new BigInteger("1000000007");
		for(int i=1;i<=n;i++){
			a=a.multiply(new BigInteger(Integer.toString(i)));
			a=a.mod(b);
		}
		//System.out.println(a);
		
		
		System.out.println(a);
		
	}

}
