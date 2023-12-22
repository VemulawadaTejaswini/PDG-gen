import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static int e;
	
	public static void main(String[] args)
	{
		Scanner sca = new Scanner(System.in);
		while(true)
		{
			e = sca.nextInt();
			if(e == 0) break;
			
			int x, y, z;
			int min = Integer.MAX_VALUE;
			int a, b;
			
			for(z = 0;z <= 100;z++)
			{
				for(y = 0;y <= 1000;y++)
				{
					a = z*z*z+y*y;
					
					if(a > e) continue;
					x = e - a;
					b = z + y + x;
					
					if(b < min) min = b;
				}
			}
			
			System.out.println(min);
		}
	}
}