import java.util.Scanner;

public class Main {
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(true)
			{
				int a = stdIn.nextInt();
			
				if(a==0)
				{
					break;
				}
				else
				{
					System.out.println(func(a));
				}
			}
	}
	
	static int func(int a)
	{
		int i = 2;
		int k = 1;
		int h = 0;
		while(true)
		{
			k = k + i;
			
			if(a<k)
			{
				break;
			}
			
			if((a-k)%i == 0)
			{
				h++;
			}
			
			i++;
		}
		
		return h;
	}
}