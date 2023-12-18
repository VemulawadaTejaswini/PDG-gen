import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
long n=sc.nextLong();
     String s="abcdefghijklmnopqrstuvwxyz";
     char[] c=s.toCharArray();
   StringBuilder s1=new StringBuilder();
     while(n>0)
     {
    	
       long x=Math.abs(n%26);
  
       if(x!=0)
       {
    	   int y=(int)x;
           s1.append(c[y-1]);
         
         n=n/26;
        
       }
       else
      {
         s1.append(c[25]);
          n=n/26;
	 n=n-1;
      }
       
      
     }
 s1.reverse();
   System.out.println(s1);
  }
}