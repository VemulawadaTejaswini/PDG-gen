/*
If you want to aim high, aim high
Don't let that studying and grades consume you
Just live life young
******************************
What do you think? What do you think?
1st on Billboard, what do you think of it
Next is a Grammy, what do you think of it
However you think, I’m sorry, but shit, I have no fcking interest
*******************************
I'm standing on top of my Monopoly board
That means I'm on top of my game and it don't stop
til my hip don't hop anymore
https://www.a2oj.com/Ladder16.html
*******************************
300IQ as writer = Sad!
*/
import java.util.*;
import java.io.*;
import java.math.*;

   public class Main
   {
      public static void main(String hi[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         int M = Integer.parseInt(st.nextToken());
         int T = Integer.parseInt(st.nextToken());
         int[] arr = readArr(N, infile, st);
         int[] brr = readArr(M, infile, st);
         long[] pref = new long[N];
         pref[0] = arr[0];
         for(int i=1; i < N; i++)
            pref[i] = pref[i-1]+arr[i];
         long sumb = 0L;
         int res = 0;
         for(int i=0; i < M; i++)
         {
            sumb += brr[i];
            if(sumb > T)
               break;
            int leftover = (int)(T-sumb);   
            int temp = i+1;
            if(arr[0] <= leftover)
            {
               int low = 0;
               int high = N-1;
               while(low != high)
               {
                  int mid = (low+high+1)/2;
                  if(pref[mid] <= leftover)
                     low = mid;
                  else
                     high = mid-1;
               }
               temp += low+1;
            }
            res = Math.max(res, temp);
         }
         int leftover = T;
         int temp = 0;
         if(arr[0] <= leftover)
         {
            int low = 0;
            int high = N-1;
            while(low != high)
            {
               int mid = (low+high+1)/2;
               if(pref[mid] <= leftover)
                  low = mid;
               else
                  high = mid-1;
            }
            temp += low+1;
         }
         res = Math.max(res, temp);
         System.out.println(res);
      }
      public static int[] readArr(int N, BufferedReader infile, StringTokenizer st) throws Exception
      {
         int[] arr = new int[N];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
         return arr;
      }
   }