import java.util.Scanner;
class Main
{
	public static void main(String[] args)throws Exception
	{
		Scanner scan=new Scanner(System.in);
		
		while(true)
		{
			int H=scan.nextInt();		
			int W=scan.nextInt();

			if(H==0&&W==0)
			{
				break;				
			}
			else
			{
				for(int i=1;i<=H;i++)
				{	
					for(int x=1;x<=W;x++)
					{
						System.out.print("#");
					}
					System.out.println("");
				}
			}
			System.out.print("\n");
		}
		
	}

}