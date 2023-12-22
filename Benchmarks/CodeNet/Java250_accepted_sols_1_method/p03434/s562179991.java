import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int N = sc.nextInt();
   int[] a = new int[N];
   for(int i=0;i<N;i++) a[i]=sc.nextInt();
   
   int allsum = 0;
   int sumA = 0;
   
   Arrays.sort(a);
   for(int i=0;i<N;i++) allsum+=a[i];
   if(N%2==1)
   {
     for(int i=0;i<N;i+=2) sumA+=a[i];
   }
   else   
   {
     for(int i=1;i<N;i+=2) sumA+=a[i];
   }
   
   System.out.println(2*sumA-allsum);
 }
}