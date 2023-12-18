import java.util.Scanner;
import java.util.StringTokenizer;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int Num = 0;

		while((Num = Integer.valueOf(scn.nextLine())) != 0)
		{
			double[][] circles = new double[Num][2];
			for(int i = 0; i < Num; i++)
			{
				String s = scn.nextLine();
				StringTokenizer sz = new StringTokenizer(s, ",");
				circles[i][0] = Double.valueOf(sz.nextToken());
				circles[i][1] = Double.valueOf(sz.nextToken());
			}

			int count = 0, max = 0;

			for(int i = 0; i < Num; i++)
			{
				for(int j = i+1; j < Num; j++)
				{
					if(!colCheck(circles[i][0], circles[i][1], circles[j][0], circles[j][1])) continue;

					count = 2;
					double dx = (circles[i][0] + circles[j][0]) / 2D;
					double dy = (circles[i][1] + circles[j][1]) / 2D;
					for(int k = 0; k < Num; k++)
					{
						if(k == i || j == k) continue;

						if(colCheck(dx, dy, circles[k][0], circles[k][1]))
						{
							count++;
						}
					}
					if(count > max)
						max = count;
				}
			}

			System.out.println(count);
		}
	}

	public static boolean colCheck(double dx, double dy, double px, double py)
	{
		double ddx = dx - px;
		double ddy = dy - py;
		return Math.sqrt(ddx*ddx+ddy*ddy) <= 2D;
	}
}