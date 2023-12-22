

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			int n = scan.nextInt();
			int p = scan.nextInt();
			if(p == 0) return;
			
			int[] inventory = new int[n];
			int whoseturn = -1;
			
			int startp = p;
			
//			inventory[0] = p;
//			p = 0;
			
			while(true)
			{
				whoseturn += 1;
				whoseturn = whoseturn%n;
//				if(whoseturn < 0)whoseturn += n;
//				System.out.println("Can " + whoseturn + "'s turn! Pool: " + p);
				
				if(p > 0)
				{
					p -= 1;
					inventory[whoseturn] += 1;
					
					if(inventory[whoseturn] == startp)
					{
//						System.out.println(p + ", start " + startp);
						System.out.println(whoseturn);
						break;
					}
				}
				else
				{
					p += inventory[whoseturn];
					inventory[whoseturn] = 0;
				}
				
				
			}
		}


	}

}

