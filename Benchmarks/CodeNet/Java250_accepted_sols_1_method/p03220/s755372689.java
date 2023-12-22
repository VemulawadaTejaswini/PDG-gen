import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int T = sc.nextInt();
   int A = sc.nextInt();
   int[] Hi = new int[N];
   for(int i =0;i<N;i++) Hi[i] = sc.nextInt();
   
   int ans =1;
   double min = Math.abs((double)(T-A)-Hi[0]*0.006);
   double di ;
   for(int i =1;i<N;i++) 
   {
     di = T-(double)Hi[i]*0.006-A;
     if(min > Math.abs(di)) 
     {
       ans = i+1;
       min = Math.abs(di);
     }
   }
   System.out.println(ans);
 }
}