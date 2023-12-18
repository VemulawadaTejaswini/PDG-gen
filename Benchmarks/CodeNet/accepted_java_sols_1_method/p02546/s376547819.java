import java.io.*;
import java.util.*;
class Main
{
	 public static void  main (String[] args) throws IOException
    {
       try{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String a="";
       a=br.readLine();
       if(a.charAt(a.length()-1)=='s')
       {
       	System.out.println(a+"es");
       }
       else
       {
       	System.out.println(a+"s");
       }
     }  	
    catch(Exception e){}
}}
