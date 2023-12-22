import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int N = sc.nextInt();
   int M = sc.nextInt();
   int[] ans = new int[N];
   
   int tmp1;
   int tmp2;

   for(int i=0;i<M;i++)
   {
     tmp1 = sc.nextInt();
     tmp2 = sc.nextInt();
     
     ans[tmp1-1]++;
     ans[tmp2-1]++;
   }
   for(int i=0;i<N;i++) System.out.println(ans[i]);
 }
}