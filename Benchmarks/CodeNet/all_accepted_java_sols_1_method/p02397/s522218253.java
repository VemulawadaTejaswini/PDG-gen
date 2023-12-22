import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int a,b;
		a=in.nextInt();
		b=in.nextInt();
		while(!(a==0&&b==0) )
		{
			if(a>b)
			{int temp=a;
			a=b;
			b=temp;
			}
			System.out.println(a + " " + b);
			
			a=in.nextInt();
			b=in.nextInt();
			
			
		}
		
	}
}