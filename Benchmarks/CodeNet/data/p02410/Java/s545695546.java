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
     
     int n = sc.nextInt();
     
     int m = sc.nextInt();
     
     int a[][] = new int[n][m];
     
     int b[] = new int[m];
     
     for(int i = 0;i < n;i ++)
     {
       for(int j = 0;j < m;j ++)
       {
         a[i][j] = sc.nextInt();
       }
     }
     for(int i = 0;i < m;i ++)
     {
       b[i] = sc.nextInt();
     }
     output(a,b,n,m);
   }
   static void output(int a[][],int b[],int n,int m)
   {
     int answer;
     
     for(int i = 0; i < n; i ++)
     {
       answer = 0;
       
       for(int j = 0; j < m; j ++)
       {
         answer += a[i][j] * b[j];
       }
       System.out.println(answer);
     }
   }
 }


