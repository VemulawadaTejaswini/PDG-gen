import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String args[]) throws IOException
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n,x,t=0;
		String brr[]=br.readLine().split(" ");
		n=Integer.parseInt(brr[0]);
		x=Integer.parseInt(brr[1]);
		t=Integer.parseInt(brr[2]);
		long ans=0;
		while(n>0)
		{
		ans+=t;
        n-=x;
		}
		System.out.println(ans);
	}
}		