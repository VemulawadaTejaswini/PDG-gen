import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		int W = stdIn.nextInt();
		int H = stdIn.nextInt();
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		int r = stdIn.nextInt();
		int[] dx ={-1,0,1,0};
		int[] dy ={0,-1,0,1};
		int count = 0;
		
		for(int i=0;i<4;i++)
		{
			if(0<=x+dx[i]*r && x+dx[i]*r<=W && 0<=y+dy[i]*r && y+dy[i]*r<=H)
			{
				count++;
			}
		}
		
		if(count==4)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}