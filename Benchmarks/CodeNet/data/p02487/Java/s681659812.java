import java.util.Scanner;

public class Main
{
	public static void Line(int w)
	{
		for(int x=0; x<w; x++)
			System.out.print("#");
		System.out.println();
	}
	
	public static void Middle(int h, int w)
	{
		for(int y=0; y<h; y++)
		{
			System.out.print("#");
			
			for(int x=1; x<w-1; x++)
				System.out.print(".");
			
			System.out.println("#");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		while(true)
		{
			int h=sc.nextInt();
			int w=sc.nextInt();
			
			if(w==0 && h==0)break;

			Line(w);
			Middle(h-2, w);
			Line(w);
			
			System.out.println();
		}
	}
}