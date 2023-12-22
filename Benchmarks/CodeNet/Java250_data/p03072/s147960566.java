import java.awt.Polygon;
import java.awt.geom.Area;
import java.awt.geom.PathIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception
	{
		new Main().run();
	}
	
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		int N = file.nextInt();
		int[] ints = new int[N];
		for(int i = 0;i<ints.length;i++)
			ints[i] = file.nextInt();
		int max = -1;
		int ans = 0;
		for(int i = 0;i< N;i++)
		{
			if(ints[i] >=max)
			{
				max = ints[i];
				ans++;
			}
		}
		System.out.println(ans);
	}
}
