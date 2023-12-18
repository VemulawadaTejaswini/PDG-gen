import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int H = sc.nextInt();
   int W = sc.nextInt();
   int N = sc.nextInt();
   int[] a = new int[N];
   for(int i=0;i<N;i++)
   {
     a[i] = sc.nextInt();
   }
   int[][] ans = new int[H][W];
   int atag=0;
   for(int i = 0;i<H;i++)
   {
     if(i%2==0) 
     {
       for(int k =0;k<W;k++)
       {
         if(a[atag]==0)
         {
           atag++;
           a[atag]--;
           ans[i][k]=atag+1;
         }
         else
         {
           ans[i][k]=atag+1;
           a[atag]--;
         }
       }
     }
     else
     {
       for(int k =W-1;k>=0;k--)
       {
         if(a[atag]==0)
         {
           atag++;
           a[atag]--;
           ans[i][k]=atag+1;
         }
         else
         {
           ans[i][k]=atag+1;
           a[atag]--;
         }
       }     
     }
   }

   for(int i=0;i<H;i++)
   {
     for(int k =0;k<W;k++)
     {
       System.out.print(ans[i][k]+" ");
     }
     System.out.println();
   }
 }
}