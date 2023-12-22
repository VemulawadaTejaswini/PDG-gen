
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int y = sc.nextInt()/1000;
		
		for(int tenk = 0; tenk <= n; tenk++)
		{
			int remon = y - (tenk*10);
			
			int bills = n - tenk;
			
			int min = bills;
			int max = bills*5;
			//min, min+4, min+8, ..., max-4, max
			
			if(remon >= min && remon <= max && (remon-min)%4 == 0)
			{
				int a = (remon - min)/4;
				int b = bills - a;
				System.out.println(tenk + " " + a + " " + b);
				return;
			}
		}
		
		System.out.println("-1 -1 -1");
	}

}
