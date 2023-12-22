import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int[] dirW = {-1,0,1,0};
		int[] dirH = {0,-1,0,1};

		while(scan.hasNext())
		{
			int n = scan.nextInt();
			if(n==0)
				break;

			int x1=0,x2=0;
			int[] width = new int[n];
			int y1=0,y2=0;
			int[] height = new int[n];


			for(int i=1;i<n;i++)
			{
				int card = scan.nextInt();
				int dir = scan.nextInt(); //0:左 1:下 2:右 3:上

				width[i] = width[card] + dirW[dir];
				height[i] = height[card] + dirH[dir];
				x1 = Math.min(x1, width[i]);
				x2 = Math.max(x2, width[i]);
				y1 = Math.min(y1, height[i]);
				y2 = Math.max(y2, height[i]);
			}
			int w=x2-x1+1;
			int h=y2-y1+1;
			System.out.println(w+" "+h);
		}
	}

}