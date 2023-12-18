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
300IQ as writer = Sad!
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
         HashMap<String, Integer> map = new HashMap<String, Integer>();
         map.put("AC",0); map.put("WA",0); map.put("RE",0); map.put("TLE",0);
         for(int i=0; i < N; i++)
         {
            String key = infile.readLine();
            if(!map.containsKey(key))
               map.put(key, 0);
            map.put(key, map.get(key)+1);
         }
         print("AC", map);
         print("WA", map);
         print("TLE", map);
         print("RE", map);
      }
      public static void print(String key, HashMap<String, Integer> map)
      {
         System.out.println(key+" x "+map.get(key));
      }
   }