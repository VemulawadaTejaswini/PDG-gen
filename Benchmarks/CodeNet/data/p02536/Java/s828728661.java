import java.util.*;
public class Main{
 public static void main(String arg[])
 {
   Scanner sc=new Scanner(System.in);
    
   int n=sc.nextInt();
   int m=sc.nextInt();
   
   for(int i=0;i<m;i++)
   {
    int a=sc.nextInt();
     int b=sc.nextInt();
   }
   if(m>=n)
   System.out.println(0);
   else
   System.out.println(n-1-m);
   
 }
}