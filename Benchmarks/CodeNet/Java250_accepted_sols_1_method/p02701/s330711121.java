import java.io.*;
import java.util.*;
import java.util.Collection;
class Main
{
  public static void main(String args[])  throws java.lang.Exception
  {
    BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine());
    HashSet<String> hs=new HashSet<String>();
    for(int i=0;i<n;i++)
     {
       String s=br.readLine();
       hs.add(s);
     } 
    System.out.println(hs.size());
   
   }
}  
