
import java.util.*;
public class Main {

	static Scanner scan=new Scanner(System.in);
	static int maxn=1009;
	static int[] a=new int[maxn];
	static int[] b=new int[maxn];
	static int[] c=new int[maxn];
	static int lm,ln;
	static boolean flag;
	public static boolean erjinzhi(int[] a)
	{
		for(int i=0;i<1024;i++)
		{
			Arrays.fill(b, 0);
			Arrays.fill(c, 0);
			
			lm=0;
			ln=0;
			for(int j=i,cnt=0;cnt<10;++cnt,j>>=1)
			{
			if((j&1)==1)
				b[lm++]=a[cnt];
			else c[ln++]=a[cnt];
			}
			flag=true;
			for(int k=1;k<lm;k++)
			{
				if(b[k-1]>b[k])
				{
					flag=false;
					break;
				}
				//System.out.println(b[k]);
			}
			//System.out.println("sdss");
			if(flag)
			{
				for(int k=1;k<ln;k++)
				{
					
					if(c[k-1]>c[k])
					{
						flag=false;
						break;
					}
					//System.out.println(c[k]);
					
				}
			}
			if(flag)
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{  
			int tmp=0;
			for(int j=0;j<10;j++)
			{
				tmp=scan.nextInt();
				a[j]=tmp;
			}
			
			boolean fl=erjinzhi(a);
			if(fl)
				System.out.println("YES\n");
			else
				System.out.println("NO\n");
		}

	}

}