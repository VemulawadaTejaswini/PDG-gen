import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int width = scan.nextInt();
		int height = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();
		
		if(x - r >= 0 && y - r >= 0 && x + r <= width && y + r <= height)
		{
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}