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
			char a = '#';
			int c = 1;	
			for(int i = 1; i<=H; i++)
			{
				for(int j = 1; j<=W; j++)
				{
					System.out.print(a);
					if(j==W)	break;
					c = c * (-1);
					if(c==-1)		a = '.';
					else if(c==1)	a = '#';
				}
				System.out.println();
			}
		}
	}
}