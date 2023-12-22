import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int A = sc.nextInt();
   String[] s = new String[A];
   int[] a  = new int[A];
 
   for(int i =0;i<A;i++)
   {
     s[i] = sc.next();
     a[i] = sc.nextInt();
   }
   String sl = sc.next();
   int ans = 0;
   boolean sleep = false;
   for(int i = 0;i<A;i++)
   {
     if(sleep) ans+= a[i];
     else if(sl.equals(s[i]))
     {
       sleep = true;
     }
   }
   System.out.println(ans);
 }
}