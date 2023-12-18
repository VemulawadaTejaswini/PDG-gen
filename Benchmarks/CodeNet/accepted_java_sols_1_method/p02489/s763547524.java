import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[])
	{
		ArrayList<Integer> ia = new ArrayList<Integer>();
		
		while(sc.hasNextInt())
		{
			int v = sc.nextInt();
			
			if(v != 0)
			{
				ia.add(v);
			}
			else
			{
				break;
			}
		}
		
		for(int i = 0; i < ia.size(); i++)
		{
			System.out.println("Case " + (i + 1) + ": " + ia.get(i));
		}
	}
}