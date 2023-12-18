import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int w = scanner.nextInt();
		int n = scanner.nextInt();
		
		int[] m = new int[w];
		for(int i=0; i<w; i++)
		{
			m[i] = i+1;
		}
		
		for(int i=0; i<n; i++)
		{	
			String s = scanner.next();
			String[] str = s.split(",");
			
			int a = Integer.parseInt(str[0]) -1;
			int b = Integer.parseInt(str[1]) -1;
			
			int buf = m[a];
			m[a] = m[b];
			m[b] = buf;
		}
		
		for(int i=0; i<w; i++)
		{
			System.out.println(m[i]);
		}
	}
}