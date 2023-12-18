import java.io.*;

public class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			String[] str = br.readLine().split(" ");
			int H = Integer.parseInt(str[0]);
			int W = Integer.parseInt(str[1]);
			if(H==0 && W==0)	break;
			char a, b = '#', c = '.';
			for(int i = 1; i<=H; i++)
			{
				if(i%2==1)
				{
					a = b;
				}else if(i%2==0)
				{
					a = c;
				}
				for(int j=1; j<=W; j++)
				{
					System.out.print(a);
					if(a==b)		a = c;
					else if(a==c)	a = b;
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}