import java.util.*;
public class Main11{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
long n=sc.nextLong();
     String s="abcdefghijklmnopqrstuvwxyz";
     char[] c=s.toCharArray();
   StringBuilder s1=new StringBuilder();
     while(n>0)
     {
       int x=(int)n%26;
    //System.out.println(n);
       if(x!=0)
       {
           s1.append(c[x-1]);
         
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
            