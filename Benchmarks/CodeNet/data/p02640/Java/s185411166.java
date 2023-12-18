import java.util.Scanner;

public class Main {
	
	public static void Cranes(int x,int y)
	{
		
		for(int i=0;i<x;i++)
		{
			if(y % 4 == 0 )
			{
				
				y=y-4;
				i++;
	
			}
			else if(y % 2 == 0) {
				y=y-2;
			}
		}
		
		if(y==0)
		{
			System.out.print("Yes");
		}
		else {
			System.out.println("No");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x= s.nextInt();
		int y=s.nextInt();
		Cranes(x,y);
				
		

	}

}
