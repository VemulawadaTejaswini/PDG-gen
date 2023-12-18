import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int obj = sc.nextInt();
			if(obj==0)
				return;
			int n= sc.nextInt();
			int count=0;
			for(int i=0; i<n; i++)
				count += -(sc.nextInt()-sc.nextInt());
			if(count >= obj)
				System.out.println("OK");
			else
				System.out.println(obj-count);
		}
	}

}