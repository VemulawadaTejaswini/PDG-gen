import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] Ai = new int[N];
   for(int i = 0;i<N;i++) Ai[i] = sc.nextInt()-(i+1); 
   Arrays.sort(Ai);
   long sum =0;
   int b ;
   long min ;
   if(N%2==1)
   {
     b = Ai[N/2];
     for(int i = 0;i<N;i++)
     {
       sum+=Math.abs(Ai[i]-b);
     }
     min = sum;
   }
   else
   {
     b = Ai[N/2];
     for(int i = 0;i<N;i++)
     {
       sum+=Math.abs(Ai[i]-b);
     }
     min = sum;
     b = Ai[(N/2)-1];
     for(int i = 0;i<N;i++)
     {
       sum+=Math.abs(Ai[i]-b);
     }
     if(min>sum) min = sum;
   }  
   System.out.println(min);
 }
}