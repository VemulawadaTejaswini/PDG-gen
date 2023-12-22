import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
		{
			String str = scanner.next();
			String[] w = str.split(",");
			
			int[] l = new int[10];
			int d = 0;
			for(int i=0; i<10; i++)
			{
				l[i] = Integer.parseInt(w[i]) * 100;
				d += l[i];
			}
			int v1 = Integer.parseInt(w[10]);
			int v2 = Integer.parseInt(w[11]);
			
			int t;
			for(t=0; (v1+v2)*t<d; t++);
			
			d = l[0];
			int s=0;
			for(; d<v1*t; d+=l[++s]);
			
			System.out.println(s+1);
		}	
	}
}