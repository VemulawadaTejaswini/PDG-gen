import java.io.*;
public class Main
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader br = 
		new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int b,f,r,v;
		int[][] base = new int[12][10];
		String[] lines;
		for(int i=0;i<N;i++)
		{
			lines = br.readLine().split(" ");
			b = Integer.parseInt(lines[0]);
			f = Integer.parseInt(lines[1]);
			r = Integer.parseInt(lines[2]);
			v = Integer.parseInt(lines[3]);
			if(base[((b-1)*3)+(f-1)][r-1]>=0)
			{
				base[((b-1)*3)+(f-1)][r-1] += v;
			}
			else
			{
				base[((b-1)*3)+(f-1)][r-1] = v;
			}
		}
		for(int i=0;i<12;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.print(" "+base[i][j]);
			}

			if((i+1)!=12&&(i+1)%3==0)
			{
				System.out.println();
				System.out.print("####################");
			}
			System.out.println();
		}
	}
}