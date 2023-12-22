import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader BR=new BufferedReader (new InputStreamReader(System.in));
		
		int n=Integer.parseInt(BR.readLine());
		StringTokenizer st=new StringTokenizer(BR.readLine());
		
		int x=-1;
		int y=1;
		int c=0;
		for(int i=0;i<n;i++)
		{
			int a=Integer.parseInt(st.nextToken());
			if(a!=x)
			{
				x=a;
				if(y>1)
				{
					int p;
					if(y%2==0)
					{
						p=y/2;
						//System.out.println("Even");
					}
					else
					{
						p=(y-1)/2;
						//System.out.println("Odd");
					}
					//System.out.println(y+"-"+p);
					c=c+p;
				}
				y=1;
			}
			else
			{
				//System.out.println(a);
				y++;
			}
		}
		if(y>1)
		{
			int p;
			if(y%2==0)
			{
				p=y/2;
				//System.out.println("Even");
			}
			else
			{
				p=(y-1)/2;
				//System.out.println("Odd");
			}
			c+=p;
		}
		System.out.println(c);
		
	}
}
