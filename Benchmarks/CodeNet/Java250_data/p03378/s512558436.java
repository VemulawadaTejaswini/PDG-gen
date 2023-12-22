import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int N = sc.nextInt();
   int M = sc.nextInt();
   int X = sc.nextInt();
   Integer[] ch = new Integer[N];
   for(int i=0;i<M;i++) ch[i] = sc.nextInt();
   
   int sum0 = 0 ;
   int sumN = 0 ;
   for(int i=1;i<X;i++)
   {
     if(Arrays.asList(ch).contains(i)) sum0++;
   }
      for(int i=X;i<N;i++)
   {
     if(Arrays.asList(ch).contains(i)) sumN++;
   }
   if(sum0<sumN) System.out.println(sum0);
   else System.out.println(sumN);
 }
}