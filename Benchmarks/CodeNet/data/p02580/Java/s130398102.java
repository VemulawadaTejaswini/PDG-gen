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
         int M = Integer.parseInt(st.nextToken());
         int K = Integer.parseInt(st.nextToken());
         ArrayDeque<Integer>[] bucketsR = new ArrayDeque[N+1];
         for(int i=1; i <= N; i++)
            bucketsR[i] = new ArrayDeque<Integer>();
         int[] freq = new int[M+1];
         for(int i=0; i < K; i++)
         {
            st = new StringTokenizer(infile.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            bucketsR[r].add(c);
            freq[c]++;
         }
         SegmentTree segtree = new SegmentTree(1, M);
         for(int i=1; i <= M; i++)
            segtree.update(i, freq[i]);
         int res = 0;
         for(int r=1; r <= N; r++)
         {
            for(int c: bucketsR[r])
               segtree.update(c, freq[c]-1);
            int temp = bucketsR[r].size()+segtree.query(1, M);
            res = Math.max(res, temp);
            for(int c: bucketsR[r])
               segtree.update(c, freq[c]);
         }
         System.out.println(res);
      }
   }
   class SegmentTree 
   {
      //range query, non lazy
      final int[] val;
      final int treeFrom;
      final int length;
  
      public SegmentTree(int treeFrom, int treeTo) 
      {
         this.treeFrom = treeFrom;
         int length = treeTo - treeFrom + 1;
         int l;
         for (l = 0; (1 << l) < length; l++);
         val = new int[1 << (l + 1)];
         this.length = 1 << l;
      }
      public void update(int index, int delta) 
      {
         //replaces value
         int node = index - treeFrom + length;
         val[node] = delta;
         for (node >>= 1; node > 0; node >>= 1) 
           val[node] = comb(val[node << 1], val[(node << 1) + 1]);
      }
      public int query(int from, int to) 
      {
         //inclusive bounds
         if (to < from)
            return 0; //0 or 1?
         from += length - treeFrom;
         to += length - treeFrom + 1;
         //0 or 1?
         int res = 0;
         for (; from + (from & -from) <= to; from += from & -from) 
             res = comb(res, val[from / (from & -from)]);
         for (; to - (to & -to) >= from; to -= to & -to)
             res = comb(res, val[(to - (to & -to)) / (to & -to)]);
         return res;
      }
      public int comb(int a, int b)
      {
         //change this
         return Math.max(a,b);
      }
   }