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
			break;
		}

		for(int i=0; i<H; i++)
		{
			for(int j=0; j<W; j++)
			{
				if(j==0 || j==W-1 || i==0 || i==H-1)
					System.out.print("#");
				else
					System.out.print(".");
			}

				System.out.println();
		}
		System.out.println();
		}

	}
}