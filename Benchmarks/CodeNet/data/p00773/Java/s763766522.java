import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static int x, y, s;
	
	private static int calc(int num, int percent)
	{
		double ret = num * (100 + percent) / 100;
		ret = Math.floor(ret);
		return (int)ret;
	}
	
	private static void start()
	{
		int ayen, byen;
		int max = 0;
		
		for(ayen = 1;ayen < s;ayen++)
			for(byen = 1;byen < s;byen++)
			{
				int aa = calc(ayen, x);
				int bb = calc(byen, x);
				
				if((aa + bb) == s)
				{
					int tmp = calc(ayen, y) + calc(byen, y);
					max = Math.max(max, tmp);
				}
			}
		
		System.out.println(max);
	}
	
	public static void main(String[] args)
	{
		
		Scanner sca = new Scanner(System.in);
		
		while(true)
		{
			x = sca.nextInt();
			y = sca.nextInt();
			s = sca.nextInt();
			if(x == 0) break;
			
			start();
		}
	}
}