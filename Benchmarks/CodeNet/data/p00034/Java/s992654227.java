import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
		{
			String str = scanner.next();
			String[] s = str.split(",");
			
			int[] l = new int[10];
			int d = 0;
			for(int i=0; i<10; i++)
			{
				l[i] = Integer.parseInt(s[i]) * 100;
				d += l[i];
			}
			int v1 = Integer.parseInt(s[10]);
			int v2 = Integer.parseInt(s[11]);
			
			int t;
			for(t=0; ;t++)
			{
				if((v1+v2)*t >= d)
				{
					break;
				}
			}
			
			d = 0;
			int st=0;
			for(int i=0; i<10; i++)
			{
				d += l[i];
				if(d >= v1*t)
				{
					st = i+1;
					break;
				}
			}
			
			System.out.println(st);
		}
		
	}
}