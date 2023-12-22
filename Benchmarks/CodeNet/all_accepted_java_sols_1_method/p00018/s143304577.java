import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int[] a = new int[5];
		
		for(int i=0; i<5; i++)
		{
			a[i] = scanner.nextInt();
		}
		
		for(int i=0; i<5; i++)
		{
			for(int j=i+1; j<5; j++)
			{
				if(a[i] < a[j])
				{
					int buf = a[i];
					a[i] = a[j];
					a[j] = buf;
				}
			}
		}
		
		for(int i=0; i<5; i++)
		{
			System.out.printf("%1$d%2$s", a[i], i==4?"\n":" ");
		}
	}
}