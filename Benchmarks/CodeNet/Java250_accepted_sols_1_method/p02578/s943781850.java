
import java.util.*;

public class Main {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) ar[i]=sc.nextInt();
		
		long preh=ar[0],table,ans=0;
		for(int i=0;i<n;i++)
		{
			table=preh-ar[i];
			if(table<0) table=0;
			ans+=table;
			preh=table+ar[i];
		}
		System.out.println(ans);
	}
	
}
