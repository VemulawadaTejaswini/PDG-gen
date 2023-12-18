import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws Exception
	{
		InputStreamReader ib=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ib);
		int n=Integer.parseInt(br.readLine());
		List<Long> li=new ArrayList<Long>();
		Quadrillion(n);
		
		
	}
	public static void Quadrillion(int n)
	{
		StringBuffer sb=new StringBuffer();
		while(n>0)
		{
			int x=n%26;
			if(x==0)
			{
				sb.append('z');
				n=n/26-1;
			}
			else
			{
				sb.append((char)((x-1)+'a'));
				n=n/26;
			}
		}
		System.out.println(sb.reverse());
	}

}
