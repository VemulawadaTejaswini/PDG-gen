import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//System.out.println(Math.pow(10,18));
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            long sum=1;
            int t=Integer.parseInt(br.readLine());
	    String s[]=br.readLine().split(" ");
           long a[]=new long[t];
            for(int i=0;i<t;i++)
           
                      a[i]=Long.parseLong(s[i]);
          for(int i=0;i<t;i++)
             sum=sum*a[i];
          if(sum>1000000000000000000l)
               System.out.println(-1);
         else
               System.out.println(sum);
}
}