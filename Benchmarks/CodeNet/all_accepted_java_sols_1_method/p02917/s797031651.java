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
         int[] arr = new int[N-1];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N-1; i++)
            arr[i] = Integer.parseInt(st.nextToken());
         //
         int[] res = new int[N];
         res[0] = arr[0];
         res[N-1] = arr[N-2];
         for(int i=1; i < N-1; i++)
         {  
            if(i%2 <= 1)
               res[i] = Math.min(arr[i], arr[i-1]);
            else
               res[i] = Math.min(arr[i], arr[i+1]);
         }
         int sum = 0;
         for(int x: res)
            sum += x;
         System.out.println(sum);
      }
   }