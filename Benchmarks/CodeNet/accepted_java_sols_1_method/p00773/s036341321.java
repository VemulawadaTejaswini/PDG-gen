

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			int x = sc.nextInt(); //prev VAT rate
			int y = sc.nextInt(); //aftr VAT rate
			int s = sc.nextInt(); //aftertax before change
			
			if(x == 0 && y == 0 && s == 0)return;
			
			long ans = 0;
			
			for(int p1 = 1; p1 <= s-1; p1++)
			{
				long aftp1 = p1 * (100+x);
				aftp1 /= 100;
				
//				System.out.println("\nif p1 is " + p1 + ", aftp1 becomes " + aftp1);
				
				long aftp2 = s - aftp1;
				
//				System.out.println("which means aftp2 is " + aftp2);
				
				if(aftp2 < 1)break;
				
				//so how much would max p2 be?
				
				long minpr2 = aftp2 * 100 / (100 + x);
				
//				System.out.println("minpr2 " + minpr2);
				
				long reaftp2 = minpr2 * (100+x);
				reaftp2 /= 100;
				
				while(reaftp2 <= aftp2)
				{
					minpr2++;
					
					reaftp2 = minpr2 * (100+x);
					reaftp2 /= 100;
				}
				minpr2--;
				reaftp2 = minpr2 * (100+x);
				reaftp2 /= 100;
				long maxpr2 = minpr2;
//				System.out.println("maxpr2 " + maxpr2 + " -> reaftp2 = " + reaftp2);
				
				long cur = ((p1 * (100 + y)/100)  +  (maxpr2 * (100 + y)/100));
				
				if(aftp1 + reaftp2 != s)
				{
//					System.out.println("MISMATCH not " + s);
//					System.out.println("ori " + p1 + " " + maxpr2);
//					System.out.println("tax1 " + aftp1 + " " + reaftp2 + "\n");
				}
				if(aftp1 + reaftp2 == s)
				{
//					if(cur > ans)System.out.println("new " + p1 + " " + maxpr2);
					ans = Math.max(ans, cur);
				}
				
			}
			
			System.out.println(ans);
//			System.out.println("end");
		}

	}

}

