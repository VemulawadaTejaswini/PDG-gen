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
         char[] arr = infile.readLine().toCharArray();
         int res = 1;
         char ch = arr[0];
         for(int i=1; i < N; i++)
         {
            if(arr[i] != ch)
            {
               ch = arr[i];
               res++;
            }
         }
         System.out.println(res);
      }
   }