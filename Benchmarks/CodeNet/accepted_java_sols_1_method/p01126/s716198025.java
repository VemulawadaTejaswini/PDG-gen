import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	
	static int n, m, a;
	static int[] h, p, q;
	
	public static void main(String[] args)
	{
		
		Scanner sca = new Scanner(System.in);
		int i, j, k;
		
		while(true)
		{
			n = sca.nextInt();
			m = sca.nextInt();
			a = sca.nextInt();
			if(n == 0) break;
			
			h = new int[m];
			p = new int[m];
			q = new int[m];
			for(i = 0;i < m;i++)
			{
				h[i] = sca.nextInt();
				p[i] = sca.nextInt();
				q[i] = sca.nextInt();
			}
			
			// hでソート
			for(i = m;i > 0;i--)
			{
				for(j = 0; j < (i - 1);j++)
				{
					if(h[j] < h[j + 1])
					{
						int tmp;
						tmp = h[j];    h[j] = h[j + 1];    h[j + 1] = tmp;
						tmp = p[j];    p[j] = p[j + 1];    p[j + 1] = tmp;
						tmp = q[j];    q[j] = q[j + 1];    q[j + 1] = tmp;
					}
				}
			}
			
			for(i = 0;i < m;i++)
			{
				if(a == p[i])
					a = q[i];
				else if(a == q[i])
					a = p[i];
			}
			
			System.out.println(a);
		}
	}
}