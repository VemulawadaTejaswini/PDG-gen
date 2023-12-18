import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int m=s.nextInt();
	int k=s.nextInt();
	int a[]=new int[n];
	int b[]=new int[m];
	   for(int i=0;i<n;i++)
	   {a[i]=s.nextInt();}
	   for(int i=0;i<m;i++)
	   {b[i]=s.nextInt();}	
	   int p1=0;
	   int p2=0;
	  int ans=0;
	   while(k>0)
	   {	
		if(p1==n||p2==m)
		{
		  if(p1==n&&p2!=m)
		  {
		    if(k>=b[p2])
	            ans++;
		    k-=b[p2];
		    p2++;
		  }
		  else if(p2==m&&p1!=n)
		  {	
			if(k>a[p1])
			ans++;
			k-=a[p1];
			p1++;
		  }
		}
		else
		{
		  if(a[p1]<b[p2])
		  {
		     if(k>=a[p1])
		     ans++;
		     k-=a[p1];
		     p1++;
		  }
		  else
		  {
		    if(k>=b[p2])
		     ans++;
		     k-=b[p2];	
		    p2++;
		  }
		}
	   }
	System.out.println(ans);
	}
}