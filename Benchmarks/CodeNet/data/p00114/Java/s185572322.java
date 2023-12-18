import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int a1=in.nextInt(),m1=in.nextInt();
			int a2=in.nextInt(),m2=in.nextInt();
			int a3=in.nextInt(),m3=in.nextInt();
			int x=1,y=1,z=1;
			if((a1|a2|a3|m1|m2|m3)==0)
				return;
			int cnt=0;
			for(;;)
			{
				cnt++;
				x=(a1*x)%m1;
				y=(a2*y)%m2;
				z=(a3*z)%m3;
				if(x==1&&y==1&&z==1)
					break;
			}
			System.out.println(cnt);
		}
	}
}