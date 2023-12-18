import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int M = sc.nextInt();
   int X = sc.nextInt();
   int Y = sc.nextInt();
   
   int[] xi = new int[N];
   int[] yi = new int[M];
   
   for(int i = 0;i<N;i++) xi[i] = sc.nextInt();
   for(int i = 0;i<M;i++) yi[i] = sc.nextInt(); 
   Arrays.sort(xi);
   Arrays.sort(yi);
   int maxX = xi[N-1];
   int minY = yi[0];

   boolean flg = false;
   if(maxX<minY)
   {
     for(int i = maxX+1;i<=minY;i++)
     {
       if(X<i&&i<=Y)
       {
         flg = true;
         break;
       }
     }
   }
   if(flg) System.out.println("No War");
   else System.out.println("War");
 }
}