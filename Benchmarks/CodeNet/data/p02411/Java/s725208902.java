
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		while(true)
		{
			int m = stdIn.nextInt();
			int f = stdIn.nextInt();
			int r = stdIn.nextInt();
			
			if(m==-1 && f==-1 && r==-1)
			{
				break;
			}
			
			if(m==-1)
			{
				m=0;
			}
			if(f==0)
			{
				f=0;
			}
			
			if((m+f)>=80)
			{
				System.out.println('A');
			}
			else if((m+f)>= 65)
			{
				System.out.println('B');
			}
			else if((m+f)>=50)
			{
				System.out.println('C');
			}
			else if((m+f)>=30)
			{
				if(r>=50)
				{
					System.out.println('C');
				}
				else
				{
					System.out.println('D');
				}
			}
			else
			{
				System.out.println('F');
			}
			
		}
	}

}