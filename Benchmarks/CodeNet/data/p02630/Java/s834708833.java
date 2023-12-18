import java.io.*;
import java.util.*;
 
 
class Main{
   public static void main(String[] args) {
      FastScanner sc = new FastScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      int n = sc.nextInt();
      
      int[] arr=new int[n];
      for(int i=0;i<n;i++) {
        arr[i] = sc.nextInt();
      }
      int q=sc.nextInt();
     
      Map<Integer,Integer> map = new HashMap<>();
      long sum=0L;
      for(int i=0;i<n;i++) {
        map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        sum+=arr[i];
      }
      
      for(int i=0;i<q;i++) {
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count = map.getOrDefault(b, 0);
        sum += (c-b) *count;
         map.remove(b);
          map.put(c, map.getOrDefault(c,0)+ count);
        out.println(sum);
      }
     
      out.close();
   }
   
  
   static class SegmentTree{
     int[] tree;
     int n;
     public SegmentTree(int[] nums) {
         if (nums.length > 0) {
             n = nums.length;
             tree = new int[n * 2];
             buildTree(nums);
         }
     }
     private void buildTree(int[] nums) {
         for (int i = n, j = 0;  i < 2 * n; i++,  j++)
             tree[i] = nums[j];
         for (int i = n - 1; i > 0; --i)
             tree[i] = tree[i * 2] + tree[i * 2 + 1];
     }
     void update(int pos, int val) {
       pos += n;
       tree[pos] = val;
       while (pos > 0) {
           int left = pos;
           int right = pos;
           if (pos % 2 == 0) {
               right = pos + 1;
           } else {
               left = pos - 1;
           }
           // parent is updated after child is updated
           tree[pos / 2] = tree[left] + tree[right];
           pos /= 2;
       }
     }
    
     
     public long sum(int l, int r) {
       // get leaf with value 'l'
       l += n;
       // get leaf with value 'r'
       r += n;
       long sum = 0;
       while (l <= r) {
           if ((l % 2) == 1) {
              sum += tree[l];
              l++;
           }
           if ((r % 2) == 0) {
              sum += tree[r];
              r--;
           }
           l /= 2;
           r /= 2;
       }
       return sum;
   }
     @Override
     public String toString() {
       return java.util.Arrays.toString(tree);
     }
     
   }
       

   //-----------PrintWriter for faster output---------------------------------
   public static PrintWriter out;
      
   //-----------MyScanner class for faster input----------
   public static class FastScanner {
      BufferedReader br;
      StringTokenizer st;
 
      public FastScanner() {
         br = new BufferedReader(new InputStreamReader(System.in));
      }
 
      String next() {
          while (st == null || !st.hasMoreElements()) {
              try {
                  st = new StringTokenizer(br.readLine());
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
          return st.nextToken();
      }
 
      int nextInt() {
          return Integer.parseInt(next());
      }
 
      long nextLong() {
          return Long.parseLong(next());
      }
 
      double nextDouble() {
          return Double.parseDouble(next());
      }
 
      String nextLine(){
          String str = "";
      try {
         str = br.readLine();
      } catch (IOException e) {
         e.printStackTrace();
      }
      return str;
      }

   }
}
