import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int N = sc.nextInt();
   char[][] c = new char[N][10];
   String[] fa = new String[N];
   for(int i=0;i<N;i++) 
   {
     c[i] = sc.next().toCharArray();
     Arrays.sort(c[i]);
     fa[i] = new String(c[i]); 
   }
   Arrays.sort(fa);
   String tmp = fa[0];
   long count = 0;
   long ans = 0 ;
   for(int i=1;i<N;i++)
   {
     if(tmp.equals(fa[i]))
     {
       count++;
       ans+=count;
     }
     else
     {
       count = 0;
       tmp = fa[i];
     }
   }
   System.out.println(ans);
 }
}