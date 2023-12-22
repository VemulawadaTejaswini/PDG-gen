/*
Roses are red
Memes are neat
All my test cases time out
Lmao yeet
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
         int[] arr = new int[N+1];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i <= N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
         int[] brr = new int[N];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            brr[i] = Integer.parseInt(st.nextToken());
         long res = 0L;
         for(int i=0; i < N; i++)
         {
            int pow = brr[i];
            if(pow <= arr[i])
            {
               res += pow;
               arr[i] -= pow;
               brr[i] = 0;
            }
            else
            {
               res += arr[i];
               pow -= arr[i];
               arr[i] = 0;
               if(arr[i+1] >= pow)
               {
                  res += pow;
                  arr[i+1] -= pow;
               }
               else
               {
                  res += arr[i+1];
                  arr[i+1] = 0;
               }
            }
         }
         System.out.println(res);
      }
   }