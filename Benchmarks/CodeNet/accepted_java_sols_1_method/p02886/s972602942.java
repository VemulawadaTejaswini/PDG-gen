/*
If you want to aim high, aim high
Don't let that studying and grades consume you
Just live life young
******************************
*/
import java.util.*;
import java.io.*;

   public class Main
   {
      public static void main(String args[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         int[] arr = new int[N];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
         long res = 0L;
         for(int a=0; a < N; a++)
            for(int b=a+1; b < N; b++)
               res += arr[a]*arr[b];
         System.out.println(res);
      }
   }