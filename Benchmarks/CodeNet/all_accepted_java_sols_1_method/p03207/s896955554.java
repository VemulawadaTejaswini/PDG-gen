import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] pi = new int[N];
   for(int i = 0;i<N;i++)
   {
    pi[i] = sc.nextInt();
   }
   
   Arrays.sort(pi);
   pi[N-1] = pi[N-1]/2;
   int ans = 0;
   for(int i = 0;i<N;i++)
   {
    ans += pi[i]; 
   }
   System.out.println(ans);
 }
}