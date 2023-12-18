import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	   Scanner s=new Scanner(System.in);
	   int n=s.nextInt();
	   Integer a[]=new Integer[n];
	   for(int i=0;i<n;i++){a[i]=s.nextInt();}
	   Arrays.sort(a,Collections.reverseOrder());
	   long ans=0;
	   int count=1;
	   	
	   //for(int i=0;i<n;i++){System.out.print(a[i]+" ");}
	   if(n%2==0)
	   {
		for(int i=0;i<(n/2)-1;i++)
		{
		  ans+=a[i];
		}
		ans+=a[(n/2)-1];
		for(int i=n/2-1;i>0;i--)
		{
		  ans+=a[i];
		}
	   }
	   else
	   {
		for(int i=0;i<n/2;i++)
		{
		  ans+=a[i];
		}
		for(int i=n/2;i>0;i--)	
		{
		  ans+=a[i];
		}
	   }
	   System.out.println(ans);
	
	}
}