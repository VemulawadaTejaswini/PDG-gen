/*
If you want to aim high, aim high
Don't let that studying and grades consume you
Just live life young
******************************
If I'm the sun, you're the moon
Because when I go up, you go down
*******************************
I'm working for the day I will surpass you
https://www.a2oj.com/Ladder16.html
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
         int[] arr = new int[N];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
         StringBuilder sb = new StringBuilder();
         long res = 0L;
         long[] map = new long[N+2];
         for(int x: arr)
            map[x]++;
         for(int i=1; i <= N; i++)
            res += map[i]*(map[i]-1)/2;
         for(int i=0; i < N; i++)
         {
            if(i > 0)
            {
               res -= map[arr[i-1]]*(map[arr[i-1]]-1)/2;
               map[arr[i-1]]++;
               res += map[arr[i-1]]*(map[arr[i-1]]-1)/2;
            }
            res -= map[arr[i]]*(map[arr[i]]-1)/2;
            map[arr[i]]--;
            res += map[arr[i]]*(map[arr[i]]-1)/2;
            sb.append(res+"\n");
         }
         System.out.print(sb);
      }
   }