import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner SC=new Scanner(System.in);
	     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	     PrintWriter pw=new PrintWriter(System.out);
	     int t=0;
	     
	     /*if(SC.hasNext())
	     t=SC.nextInt();
	     
	     for(int i=0;i<t;i++)
	     {
	          
	     }*/
	     
	     int n;
	     String s;
	     
	     n=Integer.parseInt(br.readLine());
	     s=br.readLine();
	     
	     int x=0;
	     int max=0;
	     
	     for(int i=0;i<n;i++)
	     {
	         if(s.charAt(i)=='I')
	         x++;
	         else
	         x--;
	         
	         
	         max=(int)Math.max(max,x);
	     }
	     
	     //x=(int)Math.max(0,x);
	     if(max>0)
	     pw.println(max);
	     else
	     pw.println("0");
	     //code for reading n long from bfreader in one line
	    /* String inp2=br.readLine();
	         for(int j=0;j<n-1;j++)
     	    {
     	         arr[j]=Long.parseLong(inp2.substring(0,inp2.indexOf(" ")));
     	         inp2=inp2.substring(inp2.indexOf(" ")+1);
     	    }
     	    arr[(int)n-1]=Long.parseLong(inp2);*/
	     
	     pw.close();     
		
}
}
