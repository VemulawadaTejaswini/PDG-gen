import java.util.Scanner;

public class Main {
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		
		while(true)
		{
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			int c = stdIn.nextInt();
			
			int k=0;
			int h;
			int i=0;
			int z=0;
			
			if(a==0 && b==0  && c==0)
			{
				break;
			}
			else
			{
				while(true)
				{
					h = a + i * b;
					z = z + func(h);
					if(z>=c && h!=1)
					{
						System.out.println(h);
						break;
					}
					i++;
				}
			}
		}
	}
	
	static int func(int a)
	{
		if(a==1)
		{
			return 0;
		}
		else
		{
			for(int i=2;i<a;i++)
			{
				if(a%i==0)
				{
					return 0;
				}
			}
		}
		return 1;
	}
	
}