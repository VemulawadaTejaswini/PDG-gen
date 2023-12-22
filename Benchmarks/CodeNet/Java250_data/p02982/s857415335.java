import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int D = sc.nextInt();
   int[][] Xik = new int[N][D];
   for(int i =0;i<N;i++)
   {
    for(int k = 0;k<D;k++)
    {
     Xik[i][k] = sc.nextInt();
    }
   }
   int count = 0;
   int sum = 0;
   double sq = 0.0;
   int ab = 0;
   for(int i = 0;i<N;i++)
   {
    for(int l = i+1 ; l<N;l++) 
    {
     for(int k = 0;k<D;k++)
     {
      sum += (Xik[i][k] - Xik[l][k])*(Xik[i][k] - Xik[l][k]);  
     }
      sq = Math.sqrt(sum);
      ab = (int)Math.abs(sq);

      if(sum == ab*ab) 
      {
        count++;
      }
        sum = 0;
    }
   }

   System.out.println(count);
 }
}