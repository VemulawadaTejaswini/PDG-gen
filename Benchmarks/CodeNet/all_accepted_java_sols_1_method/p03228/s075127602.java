import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		int k = sc.nextInt();
		long temp;
		for(int i=0;i<k;i++)
		{
			a = a/2;
			b = b+a;
			temp = a;
			a = b;
			b = temp;
		}
		if(k%2 == 1)
		{
			temp=a;
			a=b;
			b=temp;
		}
		System.out.println(a+" "+b);
	}
}
