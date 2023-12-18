import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		int map[][]= new int[10][10];
		for(int i=0; i<10; i++)
			Arrays.fill(map[i], 0);
		while(in.hasNext())
		{
			String str[] = in.next().split(",");
			int i=Integer.valueOf(str[0]);
			int j=Integer.valueOf(str[1]);
			int size = 	Integer.valueOf(str[2]);
			if(size == 1)
			{
				if(j-1>=0)
					map[i][j-1]++;
				if(i-1>=0)
					map[i-1][j]++;
				map[i][j]++;
				if(i+1<10)
					map[i+1][j]++;
				if(j+1<10)
					map[i][j+1]++;
			}
			if(size == 2)
			{
				if(i-1>=0&&j-1>=0)
					map[i-1][j-1]++;
				if(j-1>=0)
					map[i][j-1]++;
				if(j-1>=0&&i+1<10)
					map[i+1][j-1]++;
				if(i-1>=0)
					map[i-1][j]++;
				map[i][j]++;
				if(i+1<10)
					map[i+1][j]++;
				if(i-1>=0&&j+1<10)
					map[i-1][j+1]++;
				if(j+1<10)
					map[i][j+1]++;
				if(i+1<10&&j+1<10)
					map[i+1][j+1]++;
			}
			if(size == 3)
			{
				if(i-1>=0&&j-1>=0)
					map[i-1][j-1]++;
				if(j-1>=0)
					map[i][j-1]++;
				if(j-1>=0&&i+1<10)
					map[i+1][j-1]++;
				if(i-1>=0)
					map[i-1][j]++;
				map[i][j]++;
				if(i+1<10)
					map[i+1][j]++;
				if(i-1>=0&&j+1<10)
					map[i-1][j+1]++;
				if(j+1<10)
					map[i][j+1]++;
				if(i+1<10&&j+1<10)
					map[i+1][j+1]++;
				if(j-2>=0)
					map[i][j-2]++;
				if(i-2>=0)
					map[i-2][j]++;
				if(i+2<10)
					map[i+2][j]++;
				if(j+2<10)
					map[i][j+2]++;

			}
			int count=0;
			int max=0;
			for(int a=0; a<10; a++)
				for(int b=0; b<10;b++)
				{
					if(map[a][b]==0)
						count++;
					if(max<map[a][b])
						max=map[a][b];
				}
			System.out.println(count);
			System.out.println(max);
		}
	}
}