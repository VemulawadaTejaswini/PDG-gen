import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] ai = new int[N];

   for(int i=0;i<N;i++) ai[i] = sc.nextInt();
   
   int[] ans = new int[N];
   for(int i = 0;i<N;i++) ans[ai[i]-1]=i+1;
   for(int i=0;i<N;i++) System.out.print(ans[i]+" ");
 }
}