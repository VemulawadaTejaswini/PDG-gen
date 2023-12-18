
import java.util.Scanner;

class Main
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		int a=sc.nextInt()+sc.nextInt();
		int ans=1;
		while(a>=10)
		{
			a/=10;
			ans++;
		}
		System.out.println(ans);

	}

}