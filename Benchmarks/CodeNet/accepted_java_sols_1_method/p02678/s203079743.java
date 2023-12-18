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
         int M = Integer.parseInt(st.nextToken());
         LinkedList<Integer>[] edges = new LinkedList[N+1];
         for(int i=1; i <= N; i++)
            edges[i] = new LinkedList<Integer>();
         for(int i=0; i < M; i++)
         {
            st = new StringTokenizer(infile.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            edges[a].add(b);
            edges[b].add(a);
         }
         boolean[] seen = new boolean[N+1];
         int[] par = new int[N+1];
         Queue<Integer> q = new LinkedList<Integer>();
         seen[1] = true;   q.add(1);
         while(q.size() > 0)
         {
            int curr = q.poll();
            for(int next: edges[curr])
               if(!seen[next])
               {
                  par[next] = curr;
                  seen[next] = true;
                  q.add(next);
               }
         }
         for(int i=1; i <= N; i++)
            if(!seen[i])
            {
               System.out.println("No");
               return;
            }
         System.out.println("Yes");
         StringBuilder sb = new StringBuilder();
         for(int i=2; i <= N; i++)
            sb.append(par[i]+"\n");
         System.out.print(sb);
      }
   }