import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            long sum=1;
            int t=Integer.parseInt(br.readLine());
	    String s[]=br.readLine().split(" ");
           int a[]=new int[t];
            for(int i=0;i<t;i++)
           
                      a[i]=Integer.parseInt(s[i]);
          for(int i=0;i<t;i++)
             sum=sum*a[i];
          if(sum>Math.pow(10,18))
               System.out.println(-1);
         else
               System.out.println(sum);
}
}
           