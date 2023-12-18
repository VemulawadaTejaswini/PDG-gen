import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
		{
			int hit = 0;
			int blow = 0;
			
			int[] a = new int[4];
			for(int i=0; i<4; i++)
			{
				a[i] = scanner.nextInt();
			}
			int[] b = new int[4];
			for(int i=0; i<4; i++)
			{
				b[i] = scanner.nextInt();
			}
			
			
			for(int i=0; i<4; i++)
			{
				for(int j=0; j<4; j++)
				{
					if(i!=j && a[i]==b[j])
					{
						blow ++;
					}
				}
				if(a[i] == b[i])
				{
					hit ++;
				}
			}
			
			System.out.println(hit + " " + blow);
		}
	}
}