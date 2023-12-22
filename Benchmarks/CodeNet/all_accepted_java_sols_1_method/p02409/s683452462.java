import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine());

			int[][][] dom = new int[4][3][10];
			String[] bfrv = new String[4];
			int b=0, f=0, r=0, v=0;
			for(int i=0; i<num; i++)
			{
				bfrv = br.readLine().split(" ");
				b=Integer.parseInt(bfrv[0]);
				f=Integer.parseInt(bfrv[1]);
				r=Integer.parseInt(bfrv[2]);
				v=Integer.parseInt(bfrv[3]);
				dom[b-1][f-1][r-1] += v;
			}
			for(int b1=0; b1<4; b1++)
			{
				for(int f1=0; f1<3; f1++)
				{
					for(int r1=0; r1<10; r1++)
					{
						System.out.print(" " + dom[b1][f1][r1]);
					}
					System.out.println();
				}
				if(b1!=3)	System.out.println("####################");
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}