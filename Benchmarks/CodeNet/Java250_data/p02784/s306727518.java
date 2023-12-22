import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int H = sc.nextInt();
   int N = sc.nextInt();
   int[] A = new int[N];
   for(int i=0;i<N;i++) A[i] = sc.nextInt();
   int sum = 0;
   boolean yes = false;
   for(int i=0;i<N;i++)
   {
     sum+=A[i];
     if(sum>=H)
     {
       yes = true;
       break;
     }
   }
   String ans = "No";
   if(yes) ans = "Yes";
   System.out.println(ans);
 }
}