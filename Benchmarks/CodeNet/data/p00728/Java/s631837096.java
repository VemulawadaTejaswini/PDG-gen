
import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		int[] x = new int [256];
		int[] y = new int [256];
		Scanner stdIn = new Scanner(System.in);
		int min,max,k=0,h=0;
		while(true)
		{
			int a = stdIn.nextInt();
			if(a==0)
			{
				break;
			}
			else
			{
				for(int i=0;i<a;i++)
				{
					int b = stdIn.nextInt();
					x[i] = b;
				}
				
				min = x[0];
				max = x[0];
				h = x[0];
				
				for(int i=1;i<a;i++)
				{
					h = h + x[i];
					if(min>x[i])
						min = x[i];
					if(max<x[i])
						max = x[i];
				}
				
				y[k]=(h-min-max)/(a-2);
				
				k++;
			}
		}
		
		for(int i=0;i<k;i++)
		{
			System.out.println(y[i]);
		}
	}
}