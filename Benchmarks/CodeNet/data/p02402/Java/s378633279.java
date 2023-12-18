
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		int N = stdIn.nextInt();
		
		int min = 1000001;
		int max = -1000001;
		int sum = 0;
		
		for(int i=0;i<N;i++)
		{
			int x = stdIn.nextInt();
			sum+=x;
			if(min>x)
			{
				min = x;
			}
			else if(max<x)
			{
				max = x;
			}
		}
		
		System.out.println(min+" "+max+" "+sum);
	}

}