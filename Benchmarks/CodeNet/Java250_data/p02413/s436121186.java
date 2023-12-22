import java.util.*;

 class Main
 {
   public static void main(String args[])
   { 
    input();
   }
   static void input()
   {
     Scanner sc = new Scanner(System.in);
     
     int r = sc.nextInt();
     
     int c = sc.nextInt();
     
     int n[][] = new int[r + 1][c + 1];
     
     int rsum[] = new  int[c + 1];
     
     int csum[] = new int[r];
     
     for(int i = 0; i <= r; i ++)
     {
       for(int j = 0; j <= c; j ++)
       {
         if(i == r)
         {
           n[i][j] = rsum[j];
         }
         else if(j == c)
         {
           n[i][j] = csum[i];
           
           rsum[j] += n[i][j];
         }
         else
         {
           n[i][j] = sc.nextInt();
         
           rsum[j] += n[i][j];
         
           csum[i] += n[i][j];
         }
       }
     }
     output(n);
   }
   static void output(int n[][])
   {
     for(int i = 0; i < n.length; i ++)
     {
       for(int j = 0; j < n[i].length; j ++)
       {
         if(j != 0)System.out.print(" ");
         
         System.out.print(n[i][j]);
       }
       System.out.println();
     }
   }
 }
    
