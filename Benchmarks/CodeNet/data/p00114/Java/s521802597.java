import java.math.BigInteger;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int a1=in.nextInt(),m1=in.nextInt();
			int a2=in.nextInt(),m2=in.nextInt();
			int a3=in.nextInt(),m3=in.nextInt();
			int x=1,y=1,z=1;
			if((a1|a2|a3|m1|m2|m3)==0)
				return;
			int c1=modoru(x,a1,m1);
			int c2=modoru(y,a2,m2);
			int c3=modoru(z,a1,m3);
			BigInteger C1=new BigInteger(String.valueOf(c1));
			BigInteger C2=new BigInteger(String.valueOf(c2));
			BigInteger C3=new BigInteger(String.valueOf(c3));
			BigInteger gcd1=C1.gcd(C2);
			BigInteger lcm1=C1.multiply(C2).divide(gcd1);
			BigInteger gcd2=lcm1.gcd(C3);
			BigInteger lcm2=lcm1.multiply(C3).divide(gcd2);
			System.out.println(lcm2);
		}
	}
	public static int modoru(int x,int a,int m)
	{
		int cnt=0;
		for(;;)
		{
			cnt++;
			x=(a*x)%m;
			if(x==1)
			break;
		}
		return cnt;
	}
}