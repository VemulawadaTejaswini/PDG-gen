
import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		String []s=br.readLine().split(" ");
		
		double a[]=new double[n];
		
		for(int i=0;i<n;i++)
			a[i]=Double.parseDouble(s[i]);
					
					
		Arrays.sort(a);
		
		double sum=a[0];
		
		for(int i=1;i<n;i++)
			sum=((sum+a[i])/2.0);
			
		System.out.println(sum);	
		
	}
}


