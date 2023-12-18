import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	static int cnt;
	static int a[];
	static char id[];
	public static void main(String[] arg)
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int n=in.nextInt();//digit
			String str=in.next();
			id=new char[str.length()];
			for(int i=str.length()-1;i>=0;i--)
				id[i]=str.charAt(i);
			int m=in.nextInt();
			a=new int[m];
			for(int i=0;i<m;i++)
				a[i]=in.nextInt();
			cnt=0;
			//debug(id);
			dfs(0,0);
			System.out.println(cnt);
		}
	}
	
	static void dfs(int index,int sum)
	{
		if(index==id.length)
		{
			if(sum%10==0)
				cnt++;
		}
		else
		{
			if(Character.isDigit(id[index]))
			{
				int num=id[index]-'0';
				if(index%2==1)
					num*=2;
				if(num>=10)
					num=num%10+num/10;
				dfs(index+1,sum+num);
			}
			else
			{
				for(int i=0;i<a.length;i++)
				{
					int num=a[i];
					if(index%2==1)
						num*=2;
					if(num>=10)
						num=num%10+num/10;
					dfs(index+1,sum+num);
				}
			}
		}
	}
	
	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}