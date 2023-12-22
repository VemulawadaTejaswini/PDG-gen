import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int h = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();
		
		boolean ans = !(x-r < 0 || y-r < 0 || x+r > w || y+r > h);
		
		if(ans)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}

