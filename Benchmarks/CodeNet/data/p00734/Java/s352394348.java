import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int ta = in.nextInt();
			int ha = in.nextInt();
			if((ta|ha)==0)
				return;
			int a[]=new int[ta];
			int b[]=new int[ha];
			int ans1=-1;
			int ans2=-1;
			boolean  flag=false;
			for(int i=0; i<ta;i++)
				a[i]=in.nextInt();
			for(int j=0; j<ha;j++)
				b[j]=in.nextInt();
			int min=Integer.MAX_VALUE;
			for(int i=0;i<ta;i++)
			{			
				for(int j=0; j<ha;j++)
				{
					int sa=0;
					int sb=0;
					int tmp=a[i];
					a[i]=b[j];
					b[j]=tmp;
					for(int k=0; k<ta;k++)
						sa+=a[k];
					for(int m=0; m<ha;m++)
						sb+=b[m];
					if(sa==sb&&min>b[j]+a[i])
					{
						 ans1=b[j];
						 ans2=a[i];
						 min=a[i]+b[j];
						flag=true;
					}
					int tmp2=b[j];
					b[j]=a[i];
					a[i]=tmp2;
				}
			}
			
			if(!flag)
				System.out.println(-1);
			else
				System.out.println(ans1+" "+ans2);
		}
	}
}