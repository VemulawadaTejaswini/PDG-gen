import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int a=in.nextInt(),b=in.nextInt();
			int gcd=gcd(a,b);
			int lcm=a/gcd*b;
			System.out.println(gcd+" "+lcm);
		}
	}
	static int gcd(int a,int b)
	{
		return b==0 ? a : gcd(b,a%b);
	}
}