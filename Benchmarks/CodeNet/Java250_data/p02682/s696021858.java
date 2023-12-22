import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt(),b=in.nextInt(),c=in.nextInt(),k=in.nextInt();
		int ans=0;
		if(a>=k)
		{
			System.out.println(k);
		}
		else 
		{
			if(a+b>=k)
			{
				System.out.println(a);
			}
			else
			{
				int x=a-k+a+b;
				System.out.println(x);
			}
		}
	}
}