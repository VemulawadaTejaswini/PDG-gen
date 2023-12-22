/*
Stay innocent, be naive. 
But still dream big. 
Dream big to the point that it is beyond your ability and endeavour to achieve it. 
So dream big and don’t lose your innocence.
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
         PriorityQueue<Double> pq = new PriorityQueue<Double>();
         for(int a: arr)
            pq.add(1.0*a);
         while(pq.size() >= 2)
         {
            double a = pq.poll();
            double b = pq.poll();
            double mean = (a+b)/2.0;
            pq.add(mean);
         }
         System.out.println(pq.poll());
      }
   }