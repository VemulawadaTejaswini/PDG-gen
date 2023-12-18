

		import java.util.Scanner;
			
				public class Main
				{
					public static void main (String[] args) 
				 {
						// TODO Auto-generated method stub
						Scanner s = new Scanner(System.in);
						int a[] = new int[10];
						for (int i = 0; i < a.length; i ++)
						{	
							int m = s.nextInt();
							a[i] = m;
						}
								
					for (int i =0; i < a.length ; i++)
					{
							
						for (int j = i+1; j < a.length; j++)
						{
							int temp = 0;
							if (a[j] > a[i])
							{
								temp = a[i];
								a[i] = a[j];
								a[j]=temp;
								
								
							}
						}
					}
					for(int i=0 ; i<3 ; ++i )
					{
						System.out.println(a[i] + " ");
					}
					
				}

	}