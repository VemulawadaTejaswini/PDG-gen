import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int r, n;
	static int[] xl, xr, h;
	
	static double[] building;
	
	private static void start()
	{
		int i, j;
		
		// building作成
		building = new double[4000001];
		for(i = 0;i < 4000001;i++) building[i] = 0;
		for(i = 0;i < n;i++)
		{
			for(j = xl[i] * 100000;j <= xr[i] * 100000;j++)
			{
				building[j] = Math.max(building[j], h[i]);
			}
		}
		
		// 円と重なる時間を算出
		double min = Double.MAX_VALUE;
		for(i = 2000000 - r*100000;i <= 2000000 + r*100000;i++)
		{
			double w = Math.abs((double)i / 100000 - 20);
			double p = Math.sqrt(r*r - w*w);
			double t = (double)building[i] - p + (double)r;
			min = Math.min(min, t);
		}
		
		System.out.printf("%.04f\n", min);
	}
	
	public static void main(String[] args)
	{
		Scanner sca = new Scanner(System.in);
		
		while(true)
		{
			r = sca.nextInt();
			n = sca.nextInt();
			if(r == 0) break;
			
			xl = new int[n];
			xr = new int[n];
			h = new int[n];
			for(int i = 0;i < n;i++)
			{
				xl[i] = sca.nextInt() + 20;
				xr[i] = sca.nextInt() + 20;
				h[i] = sca.nextInt();
			}
			
			start();
		}
	}
}