import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] a = new int[N];
   String ans = "YES"; 
   for(int i=0;i<N;i++) 
   {
     a[i] = sc.nextInt();
   }
   Arrays.sort(a);
   int tmp = a[0];
   for(int i =1;i<N;i++)
   {
     if(a[i] == tmp) 
     {
       ans = "NO";
       break;
     }
     tmp = a[i];
   }
   System.out.print(ans);
 }
}