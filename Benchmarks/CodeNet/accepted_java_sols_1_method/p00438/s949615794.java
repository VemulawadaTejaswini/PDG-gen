import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			//読み込み
			int a = scan.nextInt();
			int b = scan.nextInt();
			if(a+b==0)
				break;

			int[][] work = new int[b+1][a+1];
			int n = scan.nextInt();
			for(int i=0;i<n;i++)
			{
				int x = scan.nextInt();
				int y = scan.nextInt();
				work[y-1][x-1]=1;
			}

			//探索
			int[][] data = new int[b+1][a+1];
			data[0][0]=1;
			for(int i=0;i<b;i++)
			{
				for(int j=0;j<a;j++)
				{
					if(work[i+1][j]==0)
						data[i+1][j]+=data[i][j];
					if(work[i][j+1]==0)
						data[i][j+1]+=data[i][j];
				}
			}

			System.out.println(data[b-1][a-1]);

		}
	}
}