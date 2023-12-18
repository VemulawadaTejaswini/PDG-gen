import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		int x,y;
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			x=scan.nextInt();
			y=scan.nextInt();
			if(x == 0 || y == 0) break;
			if(x>y) System.out.println(y+" "+x);
			else System.out.println(x+" "+y);
		}
	}
}