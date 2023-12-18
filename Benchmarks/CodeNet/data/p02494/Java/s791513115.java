import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		int flag = 1;
		Scanner scan= new Scanner(System.in);
		while(flag > 0)
		{
		int H = scan.nextInt();
		int W = scan.nextInt();
		if(H == 0 && W == 0)
		{
			flag=-1;
		}

		for(int i=0; i<H; i++)
		{
			for(int j=0; j<W; j++)
			{
				System.out.print("#");
			}
			
				System.out.print("\n");
		}
		}
	}
}