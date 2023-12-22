import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{
		int w, h, x, y, r;
		Scanner input = new Scanner(System.in);
		w = input.nextInt();
		h = input.nextInt();
		x = input.nextInt();
		y = input.nextInt();
		r = input.nextInt();
		if(x+r <= w && x-r >= 0 && y+r <= h && y-r >= 0)
			System.out.println("Yes");
		else 
			System.out.println("No");
	}
}