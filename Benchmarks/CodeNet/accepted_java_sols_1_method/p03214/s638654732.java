import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] ar)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		int[] a = new int[n];
		for(int i=0;i<n;i++)
			a[i]=Integer.parseInt(s[i]);
		int sum=0,pos=0,f=0;
		for(int i=0;i<n;i++)
			sum+=a[i];
		double avg = ((double)sum)/n;
		double[] b = new double[n];
		for(int i=0;i<n;i++)
			b[i]=Math.abs(a[i]-avg);
		double min=Integer.MAX_VALUE;
		int min_pos=-1;
		for(int i=0;i<n;i++)
		{
			if(b[i]<min)
			{
				min=b[i];
				min_pos=i;
			}
		}
		out.println(min_pos);
		//out.println((int)(Math.ceil((n*2)/k)+Math.ceil((n*5)/k)+Math.ceil((n*8)/k))); 
		out.flush();
		
	}
}

