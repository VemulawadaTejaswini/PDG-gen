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
				l[i] = Integer.parseInt(s[i]) * 1000;
				d += l[i];
			}
			int v1 = Integer.parseInt(s[10]);
			int v2 = Integer.parseInt(s[11]);
			
			int t;
			for(t=0; (v1+v2)*t<d; t++);
			
			d = 0;
			int st=0;
			for(int i=0; i<10; i++)
			{
				if(d >= v1*t)
				{
					st = i;
					break;
				}
				d += l[i];
			}
			
			System.out.println(st);
		}
	}
}