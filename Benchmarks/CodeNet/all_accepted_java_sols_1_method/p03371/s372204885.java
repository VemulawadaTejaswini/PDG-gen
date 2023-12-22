import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		   
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			if( a + b <= 2 * c ) 
			{
				System.out.println(a * x + b * y);
			}
			else  // 2c < a + b 
			{
				if( x == y ) 
				{
					System.out.println(c * x * 2);
				}
				else if( x < y ) 
				{
					if(b < 2 * c) 
					{
						System.out.println(c * 2 * x + b * (y-x));
					}
					else 
					{
						System.out.println(c * 2 * y);
					}
				}
				else
				{
					if(a < 2 * c) 
					{
						System.out.println(c * 2 * y + a * (x-y));
					}
					else 
					{
						System.out.println(c * 2 * x);
					}
				}
			}
		    scanner.close(); }
		  }