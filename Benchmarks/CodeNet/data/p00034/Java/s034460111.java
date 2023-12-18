import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			String st[]=in.next().split(",");
			int d[]=new int[10];
			int v1,v2;
			int di=0,di2=0;
			for(int i=0;i<10;i++)
			{
				d[i]=Integer.valueOf(st[i]);
				di+=d[i];
			}
			v1=Integer.valueOf(st[10]);
			v2=Integer.valueOf(st[11]);
			double ti=(double)di/(v1+v2);//すれ違う時の時間
			double sure=(double)ti*v1;//すれ違う時の左からの距離
			int i;
			for(i=0;;i++)
			{
				di2+=d[i];
				if(di2>=sure)
					break;
			}
			System.out.println(i+1);
		}
	}
}