import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   char[] a = sc.next().toCharArray();

   int N = a.length;
   int start = 0;
   int end = a.length;
   for(int i=0;i<N;i++) 
   {
     if(a[i]=='A')
     {
       start=i;
       break;
     }
   }
   for(int i=N-1;i>=0;i--) 
   {
     if(a[i]=='Z')
     {
       end=i;
       break;
     }
   }
    System.out.println(end-start+1);
 }
}