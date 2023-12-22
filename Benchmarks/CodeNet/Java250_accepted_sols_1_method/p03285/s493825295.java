import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
			int N = scanner.nextInt();
			
			if( N % 4 == 0 ) 
			{ 
				System.out.println("Yes");
			}
			else 
			{
				if( N >= 7 ) 
				{
					N = N - 7;
					if( N % 4 == 0 ) 
					{
						System.out.println("Yes");
					}
					else 
					{
						if( N >=  7)
						{
							N = N - 7;
							if( N % 4 == 0) 
							{
								System.out.println("Yes");
							}
							else 
							{
								if( N >= 7 ) 
								{
									N = N - 7;
									if( N % 4 == 0 ) 
									{
										System.out.println("Yes");
									}
									else 
									{
										System.out.println("No");
									}
								}
								else 
								{
									System.out.println("No");
								}
							}
						}
						else 
						{
							System.out.println("No");
						}
					}
				}
				else 
				{
					System.out.println("No");
				}
			}
		    scanner.close(); }
		  }