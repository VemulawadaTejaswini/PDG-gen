import java.io.*;
import java.util.*;
class Main
{
	public static void main(String args[]) throws IOException
	{
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char a[]=br.readLine().toCharArray();
		char b[]=br.readLine().toCharArray();
		int ans=Integer.MAX_VALUE;int cou=0;int ind=0;
		for(int i=0;i<a.length-b.length+1;i++)
		{
			//System.out.print(a[i]+",");
			for(int j=i;j<i+b.length;j++)
			{
				if(b[ind++]!=a[j])
				{
					cou+=1;
				}
			}
			//System.out.println(cou);
			ans=Math.min(cou,ans);
			ind=0;cou=0;
		}
		System.out.println(ans);
	}
	catch(Exception e){}
}}