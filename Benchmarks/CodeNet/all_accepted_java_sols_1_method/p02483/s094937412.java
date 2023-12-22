import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] a=new int[3];
		
		for(int i=0; i<3; i++)
			a[i] = sc.nextInt();
		sc.close();
		
		for(int i=0; i<3-1; i++)
		{
			for(int j=i; j<3; j++)
			{
				if(a[j] < a[i])
				{
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}

		System.out.print(a[0]);
		for(int i=1; i<3; i++)
			System.out.print(" "+a[i]);
		System.out.println();
	}
}