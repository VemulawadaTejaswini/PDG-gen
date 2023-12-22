import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int N = sc.nextInt();
   int[] a = new int[N];
   int[] b = new int[N];
   for(int i=0;i<N;i++) 
   {
     a[i]= sc.nextInt();
     b[i]= a[i];
   }
   Arrays.sort(a);
   int ans=0;
   for(int i=0;i<N;i++)
   {
     if(b[i]<=a[(N/2)-1]) ans = a[N/2];
     else ans = a[(N/2)-1];
     System.out.println(ans);
   }
 }
}