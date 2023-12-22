/*
Roses are red
Memes are neat
All my test cases time out
Lmao yeet
*/
import java.util.*;
import java.io.*;

   public class Main
   {
      public static void main(String args[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         StringTokenizer st = new StringTokenizer(infile.readLine());
         long N = Long.parseLong(st.nextToken());
         long K = Long.parseLong(st.nextToken());
         if((N+K)%2 == 1)
            System.out.println("IMPOSSIBLE");
         else
            System.out.println((N+K)/2);
      }
   }