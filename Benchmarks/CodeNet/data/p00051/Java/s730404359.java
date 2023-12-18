import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[8];

		while(n>0)
		{ 
			String  b = sc.next();
			int max =0;
			int min =0;
			int sum=0;
			for(int i=0; i<8; i++)
			{
				a[i]=Integer.valueOf(b.charAt(i))-48;
			}
			Arrays.sort(a);
			for(int i=1; i<= 8; i++)
			{
				max += a[i-1]* fact(i);	
			}
			for(int i=7;i>=0; i--)
			{
				min +=a[i]*fact(8-i);
			}
			System.out.println(max-min);
			n--;
		}
	}
	public static int fact(int n)
	{
		if(n == 1)
			return 1;
		return fact(n-1)*10;
	}


}