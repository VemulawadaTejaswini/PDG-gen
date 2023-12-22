	import java.util.*;
	/*being john malkovich*/
	class Main
	{
		public static void main(String[] args)
		{
			long max = (long)(Math.pow(10,18));
			// System.out.println(max);
			Scanner s = new Scanner(System.in);
			long x = s.nextLong();
			long y = s.nextLong();

			/*
			if((x*2)%y!=0)
			{
				System.out.println(x*2);
			}
			else if((x*3)%y!=0)
			{
				System.out.println(x*3);
			}
			else
			{
				System.out.println("-1");
			}
			*/

			/*
			
			// else
			{
				int flag = 0;
				for(long i =1;i*x <= max;i++)
				{
					if((i*x)%y!=0)
					{
						flag = 1;
						System.out.println(i*x);		
						break;
					}
				}
				if(flag == 0)
					System.out.println("-1");
			}
			// */
			/*

			if(x!=y && x%y!=0)
			System.out.println(x*y + x);
			else if(x!=y && (x+1)%y!=0)
				System.out.println((x+1)*(y + 1));
			else
			System.out.println("-1");

			*/
			/*

			if(x!=y)
				System.out.println(x);
			else
				System.out.println("-1");
				*/

			/*
			if((x*2)%y!=0)
			{
				System.out.println(x*2);
			}
			else if((x*3)%y!=0)
			{
				System.out.println(x*3);
			}
			else if((x*4)%y!=0)
			{
				System.out.println(x*4);
			}
			else
			{
				System.out.println("-1");
			}
			// else if((x*5)%y!=0)
			{
				// System.out.println(x*5);
			}
			// else if((x*6)%y!=0)
			{
				// System.out.println(x*6);
			}
			*/
			/*
			if(x!=y)
			{
				if((x*(y+1))%y!=0  && (x*(y+1)) < max  )
					System.out.println((x*(y+1)));
				else
					System.out.println((x*(y/10+1)));
			}
			else
			{
				System.out.println("-1");
			}

			*/
			/*
			if(x!=y)
			{
				long val = (x*(y+1));
				if(val < max/10)
				{
					if(x%y!=0)
						System.out.println(val);
					else
						System.out.println((x+1)*(y+1));
				}
				else
				{
					val = (((x/10)*(y/10 + 1)));
					if(val%y!=0)
						System.out.println(val);
					else
						System.out.println((x/10+1)*(y/10+1));
				}
			}
			else
				System.out.println("-1");
				*/
				
				if(x!= y && x%y !=0 )
				{
					System.out.println(x*(y+1));
				}
				else
					System.out.println("-1");
					
		}

	}