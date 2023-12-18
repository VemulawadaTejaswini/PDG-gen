import java.util.Scanner;
class Main
{
	public static void main(String[] args)throws Exception
	{
		Scanner scan=new Scanner(System.in);
		
		while(true)
		{
			double H=scan.nextDouble();		
			double W=scan.nextDouble();

			if(H==0&&W==0)
			{
				break;				
			}
			else
			{
				for(double i=1;i<=H;i++)
				{	
					if(i%2==1)
					{
						for(double a=1;a<=W;a++)
						{
							if(a%2==1)
							{
								System.out.print("#");
							}
							else if(a%2==0)
							{
								System.out.print(".");
							}
						}
						System.out.println("");
					}
					else if(i%2==0)
					{
						for(double b=1;b<=W;b++)
						{
							if(b%2==1)
							{
								System.out.print(".");
							}
							else if(b%2==0)
							{
								System.out.print("#");
							}
						}
						System.out.println("");
					
					}
				}System.out.print("\n");
			
			}
			
		}
		
	}

}