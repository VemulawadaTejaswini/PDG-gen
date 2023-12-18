import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner sca = new Scanner(System.in);
		while(true)
		{
			int n = sca.nextInt();
			if(n == 0) break;
			
			int[][][] count = new int[24][60][60];
			int h, m, s;
			int i;
			int a, b, c;
			
			for(h = 0;h < 24;h++)
				for(m = 0;m < 60;m++)
					for(s = 0;s < 60;s++)
						count[h][m][s] = 0;
			
			for(i = 0;i < n;i++)
			{
				String text = sca.next();
				
				h = (text.charAt(0) - '0') * 10 + (text.charAt(1) - '0');
				m = (text.charAt(3) - '0') * 10 + (text.charAt(4) - '0');
				s = (text.charAt(6) - '0') * 10 + (text.charAt(7) - '0');
				
				text = sca.next();
				a = (text.charAt(0) - '0') * 10 + (text.charAt(1) - '0');
				b = (text.charAt(3) - '0') * 10 + (text.charAt(4) - '0');
				c = (text.charAt(6) - '0') * 10 + (text.charAt(7) - '0');
				
				for(;h <= a;h++)
					for(;m <= b;m++)
						for(;s <= c;s++)
							count[h][m][s]++;
			}
			
			int max = 0;
			
			for(h = 0;h < 24;h++)
				for(m = 0;m < 60;m++)
					for(s = 0;s < 60;s++)
						if(count[h][m][s] > max) max = count[h][m][s];
			
			System.out.println(max);
		}
	}
}