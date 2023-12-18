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
Shining through the city with a little funk and soul
*******************************
300iq as writer = Sad!
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
         int[] arr = new int[N];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
         int[] brr = new int[N];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            brr[i] = Integer.parseInt(st.nextToken());
         int[] left = new int[N+1];
         int[] right = new int[N+1];
         Arrays.fill(left, -1);
         for(int i=0; i < N; i++)
         {
            if(left[arr[i]] == -1)
               left[arr[i]] = i;
            right[arr[i]] = i;
         }
         int[] leftB = new int[N+1];
         int[] rightB = new int[N+1];
         Arrays.fill(leftB, -1);
         for(int i=0; i < N; i++)
         {
            if(leftB[brr[i]] == -1)
               leftB[brr[i]] = i;
            rightB[brr[i]] = i;
         }
         int[] ranges = new int[N];
         for(int v=1; v <= N; v++)
            if(left[v] != -1)
            {
               int len = right[v]-left[v]+1;
               int lenB = rightB[v]-left[v]+1;
               if(len+lenB > N)
               {
                  System.out.println("No");
                  return;
               }
               if(left[v] == 0)
               {
                  ranges[1]++;
                  if(N-lenB+1-right[v] < N)
                     ranges[N-lenB+1-right[v]]--;
               }
               else if(right[v] == N-1)
               {
                  ranges[N-right[v]]++;
                  int dist = right[v]-(right[v]-lenB+1);
                  if(dist < 0)
                     dist += N;
                  if(dist < N)
                     ranges[dist]--;
               }
               else
               {
                  if(left[v] >= lenB)
                  {
                     int dist = N-left[v];
                     ranges[dist]++;
                     int lol = left[v]-lenB+1;
                     if(lol-left[v] > dist)
                     {
                        dist = lol-left[v];
                        if(dist < N)
                           ranges[dist]--;
                     }
                     ranges[right[v]+1-left[v]]++;
                  }
                  else
                  {
                     int low = right[v]+1;
                     int high = N-1;
                     while(low != high)
                     {
                        int mid = (low+high+1)/2;
                        int end = mid+lenB-1;
                        end %= N;
                        if(left[v] <= end && end <= right[v])
                           high = mid-1;
                        else
                           low = mid;
                     }
                     ranges[right[v]+1-left[v]]++;
                     if(low+1-left[v] < N)
                        ranges[low+1-left[v]]--;
                  }
               }
            }
         int temp = 0;
         int head = -1;
         for(int i=0; i < N; i++)
         {
            temp += ranges[i];
            if(temp == N)
               head = i;
         }
         if(head == -1)
            System.out.println("No");
         else
         {
            System.out.println("Yes");
            StringBuilder sb = new StringBuilder();
            for(int i=0; i < N; i++)
            {
               int lmao = head+i;
               if(lmao >= N)
                  lmao -= N;
               sb.append(brr[lmao]+" ");
            }
            System.out.println(sb);
         }
      }
   }