import java.util.LinkedList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			int w = scan.nextInt();
			int h = scan.nextInt();
			if(w+h==0)
				break;
			int[][] map = new int[h][w];
			int[][] wall_h = new int[h][w-1];
			int[][] wall_s = new int[h-1][w];
			//壁読み込み
			for(int i=0;i<h*2-1;i++)
			{
				if(i%2==0)
				{
					for(int j=0;j<w-1;j++)
						wall_h[i/2][j]=scan.nextInt();
				}else{
					for(int j=0;j<w;j++)
						wall_s[i/2][j]=scan.nextInt();
				}
			}

			LinkedList<Integer> listX = new LinkedList<Integer>();
			LinkedList<Integer> listY = new LinkedList<Integer>();
			listX.add(0);
			listY.add(0);
			map[0][0]=1;
			while(listX.size()>0)
			{
				int x = listX.poll();
				int y = listY.poll();
				if(y+1<h && map[y+1][x]==0 && wall_s[y][x]==0)
				{
					map[y+1][x] = map[y][x]+1;
					listX.add(x);
					listY.add(y+1);
				}
				if(y-1>=0 && map[y-1][x]==0 && wall_s[y-1][x]==0)
				{
					map[y-1][x] = map[y][x]+1;
					listX.add(x);
					listY.add(y-1);
				}
				if(x+1<w && map[y][x+1]==0 && wall_h[y][x]==0)
				{
					map[y][x+1] = map[y][x]+1;
					listX.add(x+1);
					listY.add(y);
				}
				if(x-1>=0 && map[y][x-1]==0 && wall_h[y][x-1]==0)
				{
					map[y][x-1] = map[y][x]+1;
					listX.add(x-1);
					listY.add(y);
				}
			}

			System.out.println(map[h-1][w-1]);
		}
	}

}