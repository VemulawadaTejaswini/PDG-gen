import java.util.Scanner;
class Main
{
	public static void main(String[] args)throws Exception
	{
		Scanner scan=new Scanner(System.in);
		
		int W=scan.nextInt();
		int H=scan.nextInt();
		int x=scan.nextInt();
		int y=scan.nextInt();
		int r=scan.nextInt();
		

		if(W<x||W==x||H<y||H==y||x<1||y<1||W<r||H<y||W<(r*2)||H<(r*2))
		{
			System.out.println("No");
		}
		else
		{
			System.out.println("Yes");
		}
	}
}