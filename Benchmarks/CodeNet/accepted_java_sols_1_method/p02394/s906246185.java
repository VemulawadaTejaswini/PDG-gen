import java.util.Scanner;

class Main
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		int W = value;
		value = scan.nextInt();
		int H = value;
		value = scan.nextInt();
		int x = value;
		value = scan.nextInt();
		int y = value;
		value = scan.nextInt();
		int r = value;
		
		if((x-r < 0 || x+r > W)||(y-r < 0 || y+r > H))
		{
			System.out.println("No");
		}
		else
		{
			System.out.println("Yes");
		}
		
	}

}

