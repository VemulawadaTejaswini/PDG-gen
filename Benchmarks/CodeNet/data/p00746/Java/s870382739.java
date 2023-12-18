import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		while(true)
		{
			int N = stdIn.nextInt();
			
			if(N==0)
			{
				break;
			}
			
			int[][] data = new int[N][2];
			int[] data_x = new int[N];
			int[] data_y = new int[N];
			int[] move_x = {-1,0,1,0};
			int[] move_y = {0,1,0,-1};
			data_x[0] = 0;
			data_y[0] = 0;
			int min_x = 0;
			int max_x = 0;
			int min_y = 0;
			int max_y = 0;
			
			for(int i=1;i<N;i++)
			{
				data[i][0] = stdIn.nextInt();
				data[i][1] = stdIn.nextInt();
			}
			
			for(int i=1;i<N;i++)
			{
				data_x[i] = data_x[data[i][0]]+move_x[data[i][1]];
				data_y[i] = data_y[data[i][0]]+move_y[data[i][1]];
				if(min_x>data_x[i])
				{
					min_x = data_x[i];
				}
				if(max_x<data_x[i])
				{
					max_x = data_x[i];
				}
				if(min_y>data_y[i])
				{
					min_y = data_y[i];
				}
				if(max_y < data_y[i])
				{
					max_y = data_y[i];
				}
			}
			
			System.out.println(((max_x-min_x)+1)+" "+((max_y-min_y)+1));
			
		}
	}

}