import java.util.*;

public class Main
{
	public static void main(String Args[])
	{
		int a;
		Scanner s1=new Scanner(System.in);
		a=s1.nextInt();
		if(a%2==0)
		{
			System.out.println(a/2);
		}
		else
		{
				System.out.println(a/2+1);
		}
	}
}