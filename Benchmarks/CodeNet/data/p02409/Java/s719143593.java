import java.util.*;

 class Main
 {
   public static void main(String args[])
   { 
     int[][][] i = new int[4][3][10];
     
    input(i);
    
    output(i);
   }
   static int[][][] input(int info[][][])
   {
     Scanner sc = new Scanner(System.in);
     
     int n = sc.nextInt();
    
     for(int i = 0; i < n; i ++)
     {
       int b = sc.nextInt();
       
       int f = sc.nextInt();
       
       int r = sc.nextInt();
       
       int v = sc.nextInt();
       
       info[b - 1][f - 1][r - 1] += v;
     }
     return info;
   }
   
   static void output(int info[][][])
   {
     for(int b = 0;b < 4;b ++)
     {
       if(b != 0){
         System.out.println("####################");
       }
       for(int f = 0;f < 3;f ++)
       {
         for(int r = 0;r < 10;r ++)
         {
           System.out.print(" " + info[b][f][r]);
         }
         System.out.println();
       }
     }
   }
 }
    
    
