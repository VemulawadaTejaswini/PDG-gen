import java.util.LinkedList;
import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int m=in.nextInt();
			int n=in.nextInt();
			if((m|n)==0)
				return;
			LinkedList<Integer> Li=new LinkedList<Integer>();
			for(int i=1;i<=m;i++)
				Li.add(i);
			int cnt =1;
			int now=0;
			for(int i=0;i<n;i++)
			{
				String x=in.next();
				if(cnt%15==0)
				{
					if(!x.equals("FizzBuzz"))
					{
						Li.remove(now);
						now--;}
				}
				else if(cnt%5==0)
				{
					if(!x.equals("Buzz"))
					{
						Li.remove(now);
						now--;
					}
				}
				else if(cnt%3==0)
				{
					if(!x.equals("Fizz"))
					{
						Li.remove(now);
						now--;
					}
				}
				cnt++;
				now++;
				now%=Li.size();
			}
			int j=0;
				for(int i=0;i<Li.size();i++)
				{
					if(j==1)
					System.out.print(" "+Li.get(i));
					else
						System.out.print(Li.get(i));
					j=1;
				}
			System.out.println();
		}
	}
}