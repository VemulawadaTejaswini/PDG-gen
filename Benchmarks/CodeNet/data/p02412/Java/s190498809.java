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
     
     while(true)
     {
       int n = sc.nextInt();
       
       int x = sc.nextInt();
       
       if(n == 0 && x == 0)break;
       
       output(n,x);
     }
     
   }
   static void output(int n,int x)
   {
     int answer = 0;
     
     for(int i = 1; i <= n - 2; i ++)
     {
       for(int j = i + 1; j <= n - 1; j ++)
       {
         for(int k = j + 1; k <= n; k ++)
         {
           if(i + k + j == x)
           {
             answer ++;
           }
         }
       }
     }
     System.out.println(answer);
   }
 }
  
