import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int p0=0, p1=0;
		
		for(int i=0; i<n; i++)
		{
			String in0 = scanner.next();
			String in1 = scanner.next();
			
			if(in0.compareTo(in1) == 0)
			{
				p0 += 1;
				p1 += 1;
			}
			else if(in0.compareTo(in1) > 0)
			{
				p0 += 3;
			}
			else 
			{
				p1 += 3;
			}
		}
		System.out.println(p0+" "+p1);
	}
}