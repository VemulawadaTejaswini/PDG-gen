/*
If you want to aim high, aim high
Don't let that studying and grades consume you
Just live life young
******************************
What do you think? What do you think?
1st on Billboard, what do you think of it
Next is a Grammy, what do you think of it
However you think, I’m sorry, but shit, I have no fucking interest
*******************************
Higher, higher, even higher, to the point you won’t even be able to see me
https://www.a2oj.com/Ladder16.html
*******************************
300IQ as writer = Sad!
*/
import java.util.*;
import java.io.*;
import java.math.*;

   public class Main
   {
      public static void main(String omkar[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         int K = Integer.parseInt(st.nextToken());
         StringBuilder sb = new StringBuilder();
         int[] arr = new int[N];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
         K = Math.min(K, 100);
         //solve
         while(K-->0)
         {
            int[] ranges = new int[N];
            for(int i=0; i < N; i++)
            {
               int begin = i-arr[i];
               int end = i+arr[i];
               begin = Math.max(begin, 0);
               ranges[begin]++;
               if(end < N-1)
                  ranges[end+1]--;
            }
            int curr = 0;
            for(int i=0; i < N; i++)
            {
               curr += ranges[i];
               arr[i] = curr;
            }
         }
         for(int x: arr)
            sb.append(x+" ");
         System.out.println(sb);
      }
   }