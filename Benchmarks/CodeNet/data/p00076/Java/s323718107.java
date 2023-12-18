import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			if(n==-1)
				return;
			double x=0;
			double y=0;
			double rad=0;
			while(n-->0)
			{
				x+=Math.cos(rad);
				y+=Math.sin(rad);
				rad=Math.atan2(y,x)+Math.PI/2;
			}
			System.out.printf("%.2f\n%.2f\n",x,y);
		}
	}
}