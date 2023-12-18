import java.util.*;
public class Main
{
	static HashSet<String>HS;
	static int a[];
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			if(n==0)
				return;
			int k=in.nextInt();
			int p[]=new int[k];
			boolean f[]=new boolean[n];
			a=new int[n];
			HS=new HashSet<String>();
			for(int i=0;i<n;i++)
				a[i]=in.nextInt();
			permutation(0,p,f);
			System.out.println(HS.size());
		}
	}

	static void permutation(int n,int p[],boolean f[])
	{
		if(n==p.length)
		{
			String str="";
			for(int x:p)
				str+=x;
			HS.add(str);
		}
		else 
		{
			for(int i=0;i<a.length;i++)
			{
				if(f[i]) 
					continue;
				p[n]=a[i];
				f[i]=true;
				permutation(n+1,p,f);
				f[i]=false;
			}
		}
	}
}