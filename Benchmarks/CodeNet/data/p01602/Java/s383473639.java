import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a=0;
		boolean judge=true;
		for(int i=0;i<n;i++)
		{
			String str=in.next();
			int x=in.nextInt();
			if(str.equals("("))
				a+=x;
			else
				a-=x;
			if(a<0)
				judge=false;
			
		}
		System.out.println(judge&&a==0 ? "YES":"NO");
	}

	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}