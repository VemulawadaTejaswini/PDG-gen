import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int w=in.nextInt();
			int a[]={1,2,4,8,16,32,64,128,256,512};
			boolean b[]=new boolean[10];
			Arrays.fill(b, false);
			if(w>=512)
			{
				w-=512;
				b[9]=true;
			}
			if(w>=256)
			{
				w-=256;
				b[8]=true;
			}
			if(w>=128)
			{
				w-=128;
				b[7]=true;
			}
			if(w>=64)
			{
				w-=64;
				b[6]=true;
			}
			if(w>=32)
			{
				w-=32;
				b[5]=true;
			}
			if(w>=16)
			{
				w-=16;
				b[4]=true;
			}
			if(w>=8)
			{
				w-=8;
				b[3]=true;
			}
			if(w>=4)
			{
				w-=4;
				b[2]=true;
			}
			if(w>=2)
			{
				w-=2;
				b[1]=true;
			}
			if(w>=1)
			{
				w-=1;
				b[0]=true;
			}
			boolean f=false;
			for(int i=0;i<10;i++)
			{
				if(b[i])
				{
					if(f)
						System.out.print(" ");
					System.out.print(a[i]);
					f=true;
				}
			}
			System.out.println();
		}
	}
}