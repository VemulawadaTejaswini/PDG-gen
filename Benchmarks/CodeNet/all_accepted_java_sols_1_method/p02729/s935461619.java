import java.util.Scanner;

class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int evenBalls = sc.nextInt();
		
		int oddBalls  = sc.nextInt();
		
		
		
		int evenAvailable = 0;
		
		for(int i=1; i<evenBalls; i++)
		{
			evenAvailable += i;
			
		}
		
		
		for(int i=1; i<oddBalls; i++)
		{
			evenAvailable += i;
			
		}
		
		System.out.println(evenAvailable);
		
		
		

	}

}
