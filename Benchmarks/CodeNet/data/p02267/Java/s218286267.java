import java.util.Scanner;

 class Main
 {
     static int Search(int[]s, int key,int n)
     {
         for(int i = 0; i < n; i++)
             {
                 if(s[i] == key)
                     return 1;
             }
         return 0;

     }

     public static void main(String[] args)
     {
         Scanner In = new Scanner(System.in);

         int n = In.nextInt();
         int []S = new int[n];

         for(int i = 0; i < n; i++)
             {
                 S[i] = In.nextInt();
             }

         int q = In.nextInt();
         int []T = new int[q];

         for(int i = 0; i < q; i++)
             {
                 T[i] = In.nextInt();
             }
         int count = 0;


         for(int i = 0; i < q; i++)
             {
                 count += Search(S,T[i],n);
             }
         System.out.println(count);
     }
 }