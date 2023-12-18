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
         char[] arr = infile.readLine().toCharArray();
         int[] prefR = new int[N];
         int[] prefW = new int[N];
         if(arr[0] == 'R')
            prefR[0] = 1;
         else
            prefW[0] = 1;
         for(int i=1; i < N; i++)
         {
            if(arr[i] == 'R')
               prefR[i]++;
            else  
               prefW[i]++;
            prefR[i] += prefR[i-1];
            prefW[i] += prefW[i-1];
         }
         int A = 0; //RW
         int B = 0; //WR
         for(int i=0; i < N; i++)
            if(arr[i] == 'R')
               A++;
         int res = Math.min(prefR[N-1], prefW[N-1]);
         for(int i=0; i < N; i++)
         {
            if(arr[i] == 'R')
               A--;
            else
               B++;
            res = Math.min(res, cost(A,B));
         }
         System.out.println(res);
      }
      public static int cost(int X, int Y)
      {
         int shared = Math.min(X,Y);
         return X+Y-shared;
      }
   }