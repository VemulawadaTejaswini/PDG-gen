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
         String input = infile.readLine();
         if(N < 3200)
           	System.out.println("red");
        else
          	System.out.println(input);
      }
   }