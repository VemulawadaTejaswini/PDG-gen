import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		while(N-->0)
		{
			int nx=0;
			int ny=0;
			int ax=0;
			int ay=0;
			int dis=0;
			for(;;)
			{
				int dx=in.nextInt();
				int dy=in.nextInt();
				if((dx|dy)==0)
					break;
				nx+=dx;
				ny+=dy;
				if(dis<=nx*nx+ny*ny)
				{
					if(dis<nx*nx+ny*ny)
					{
						dis=nx*nx+ny*ny;
						ax=nx;
						ay=ny;
					}
					else if(dis==nx*nx+ny*ny&&nx>ax)
					{
						dis=nx*nx+ny*ny;
						ax=nx;
						ay=ny;
					}
				}
			}
			System.out.println(ax+" "+ay);
		}
	}
}