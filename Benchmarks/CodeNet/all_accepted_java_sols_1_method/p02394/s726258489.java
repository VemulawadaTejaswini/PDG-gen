import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int W = scanner.nextInt();
		int H = scanner.nextInt();
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int r = scanner.nextInt();
                if(0 <= x -r && x + r <= W && 0 <= y - r && y + r <= H)
		{
  			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
		
