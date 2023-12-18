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
         int K = Integer.parseInt(st.nextToken());
         int[] next = new int[N+1];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            next[i+1] = Integer.parseInt(st.nextToken());
         long[] arr = new long[N+1];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            arr[i+1] = Long.parseLong(st.nextToken());
         long res = Long.MIN_VALUE;
         for(int i=1; i <= N; i++)
            res = Math.max(res, arr[next[i]]);
         for(int v=1; v <= N; v++)
         {
            boolean[] seen = new boolean[N+1];
            int curr = v;
            long temp = 0L;
            int cnt = 0;
            while(!seen[curr] && cnt < K)
            {
               seen[curr] = true;
               curr = next[curr]; 
               temp += arr[curr];
               res = Math.max(res, temp);
               cnt++;
            }
            if(cnt < K)
            {
               cnt = K-cnt;
               //cycle
               ArrayList<Integer> ls = new ArrayList<Integer>();
               int boof = next[curr];
               while(boof != curr)
               {
                  ls.add(boof);
                  boof = next[boof];
               }
               ls.add(curr);
               long sum = 0L;
               for(int x: ls)
                  sum += arr[x];
               if(cnt < ls.size())
               {
                  for(int i=0; i < cnt; i++)
                  {
                     temp += arr[ls.get(i)];
                     res = Math.max(res, temp);
                  }
               }
               else
               {
                  if(sum <= 0)
                  {
                     for(int i=0; i < ls.size(); i++)
                     {
                        temp += arr[ls.get(i)];
                        res = Math.max(res, temp);
                     }
                  }
                  else
                  {
                     long lmao = cnt/ls.size();
                     lmao *= sum;   lmao += temp;
                     res = Math.max(res, lmao);
                     for(int i=0; i < cnt%ls.size(); i++)
                     {
                        lmao += arr[ls.get(i)];
                        res = Math.max(res, lmao);
                     }
                     lmao = (cnt/ls.size())-1;
                     lmao *= sum; lmao += temp;
                     res = Math.max(res, lmao);
                     for(int i=0; i < ls.size(); i++)
                     {
                        lmao += arr[ls.get(i)];
                        res = Math.max(res, lmao);
                     }
                  }
               }               
               /*
               if(sum >= 0)
               {
                  long lmao = cnt/ls.size();
                  lmao *= sum;   lmao += temp;
                  res = Math.max(res, lmao);
                  for(int i=0; i < cnt%ls.size(); i++)
                  {
                     lmao += arr[ls.get(i)];
                     res = Math.max(res, lmao);
                  }
               }
               for(int i=0; i < Math.min(ls.size(), cnt); i++)
               {
                  temp += arr[ls.get(i)];
                  res = Math.max(res, temp);
               }*/
            }
            res = Math.max(res, temp);
         }
         System.out.println(res);
      }
   }