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
         int A = Integer.parseInt(st.nextToken());
         int B = Integer.parseInt(st.nextToken());
         int C = Integer.parseInt(st.nextToken());
         int K = Integer.parseInt(st.nextToken());
         if(K <= A+B)
            System.out.println(Math.min(K, A));
         else
         {
            int left = K-A-B;
            System.out.println(A-left);
         }
      }
   }