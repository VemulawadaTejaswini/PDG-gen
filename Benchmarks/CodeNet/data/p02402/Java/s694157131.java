import java.util.*;

 class Main
 {
   public static void main(String args[])
   { 
    answer();
   }
   static void answer()
   {
     Scanner sc = new Scanner(System.in);
     
     int n = sc.nextInt();
     
     int[] table = new int[n];
     
     int min = 0;
     
     int max = 0;     
     
     long sum = 0;
     
     for(int i = 0; i < n; i ++)
     {
       table[i] = sc.nextInt();
       
       if(i == 0)
       {
         min = table[i];
         
         max = table[i];
       }
       else 
       {
         if(min > table[i])
         {
           min = table[i];
         }
         if(max < table[i])
         {
           max = table[i];
         }
       }
       sum = sum + table[i];
     }
     System.out.printf("%d %d %d",min,max,sum);
     
     System.out.println();
   }
 }
    
