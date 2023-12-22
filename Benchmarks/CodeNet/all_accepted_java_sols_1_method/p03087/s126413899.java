import java.io.*;
import java.util.*;

public class Main
{

	static OutputStream outputStream = System.out;
	static PrintWriter out = new PrintWriter(outputStream);

	
	
	public static void main(String[] Rohan)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		String[] s1=br.readLine().split(" ");

		int q=Integer.parseInt(s1[1]);


		String s=br.readLine();

		int n=Integer.parseInt(s1[0]);

		int[] a=new int[n];


		for(int i=1;i<n;i++)
		{
			if(s.charAt(i)=='C' && s.charAt(i-1)=='A')
				a[i]++;
		}
		for(int i=1;i<n;i++) a[i]+=a[i-1];

		for(int i=0;i<q;i++)
		{
			s1=br.readLine().split(" ");
			int l=Integer.parseInt(s1[0]),r=Integer.parseInt(s1[1])-1;

			if(l>r) out.println(0);

			else
			{
				out.println(a[r]-a[l-1]);
			}
		}

		
		out.close();
		

	}
}