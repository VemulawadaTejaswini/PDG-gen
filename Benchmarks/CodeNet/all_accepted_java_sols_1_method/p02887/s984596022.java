
import java.util.*;
public class Main{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   String S = sc.next();
   char Si = S.charAt(0);
   int count = 1;
   for(int i = 1;i<N;i++)
   {
     if(S.charAt(i)==Si) ;
     else 
     {
       count++;
       Si = S.charAt(i);
     }
   }
        	System.out.println(count);
 }
}