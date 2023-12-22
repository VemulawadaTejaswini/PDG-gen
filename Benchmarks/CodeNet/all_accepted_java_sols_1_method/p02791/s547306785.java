import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] b = new int[N];
   for(int i=0;i<N;i++) b[i] = sc.nextInt();
   int ans = 1; 
   int tmp = b[0];
   for(int i =1; i<N;i++)
   {
     if(tmp > b[i])
     {
       tmp = b[i];
       ans++;
     }
   }
   System.out.println(ans);
 }
}