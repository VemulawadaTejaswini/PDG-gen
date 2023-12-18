import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	
	static int n, q;
	static int[] okday;
	
	static void start()
	{
		int okmax = 0;
		int day;
		
		for(day = 1;day < 100;day++)
		{
			okmax = Math.max(okmax, okday[day]);
		}
		if(okmax < q)
		{
			System.out.println("0");
			return;
		}

		for(day = 1;day < 100;day++)
		{
			if(okday[day] == okmax)
			{
				System.out.println(day);
				return;
			}
		}
	}
	
	public static void main(String[] args)
	{
		
		Scanner sca = new Scanner(System.in);
		
		while(true)
		{
			n = sca.nextInt();
			q = sca.nextInt();
			if(n == 0) break;
			
			okday = new int[100];
			for(int i = 0;i < 100;i++) okday[i] = 0;
			
			for(int i = 0;i < n;i++)
			{
				int m = sca.nextInt();
				for(int j = 0;j < m;j++) okday[sca.nextInt()]++;
			}
			
			start();
		}
	}
}