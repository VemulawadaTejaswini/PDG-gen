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
NEVER DO 300IQ CONTESTS EVER
300IQ AS WRITER = EXTRA NONO
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
         Range[] arr = new Range[N];
         int[] x = new int[N];
         int[] y = new int[N];
         for(int i=0; i < N; i++)
         {
            st = new StringTokenizer(infile.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[i] = new Range(a,b);
            x[i] = a;
            y[i] = b;
         }
         sort(x);
         sort(y);
         if(N%2 == 1)
            System.out.println(Math.abs(x[N/2]-y[N/2])+1);
         else
         {
            int min = x[N/2]+x[N/2-1];
            int max = y[N/2]+y[N/2-1];
            System.out.println(Math.abs(max-min)+1);
         }
      }
      public static void sort(int[] arr)
      {
         //stable heap sort
         PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
         for(int a: arr)
            pq.add(a);
         for(int i=0; i < arr.length; i++)
            arr[i] = pq.poll();
      }
   }
   class Range implements Comparable<Range>
   {
      public int left;
      public int right;
      
      public Range(int a, int b)
      {
         left = a;
         right = b;
      }  
      public int compareTo(Range oth)
      {
         if(left == oth.left)
            return right-oth.right;
         return left-oth.left;
      }
   }