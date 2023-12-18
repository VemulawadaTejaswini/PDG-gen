import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String []args) throws IOException {
      FastScanner in  = new FastScanner(System.in);
      PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), false);
      solve(in, out);
      in.close();
      out.close();
    }
    static class FastScanner{
  BufferedReader reader;
  StringTokenizer st;
  FastScanner(InputStream stream){reader=new BufferedReader(new InputStreamReader(stream));st=null;}
  String next(){while(st == null || !st.hasMoreTokens()){try{String line = reader.readLine();if(line == null){return null;}
       st = new StringTokenizer(line);}catch (Exception e){throw new RuntimeException();}}return st.nextToken();}
  String nextLine()  {String s=null;try{s=reader.readLine();}catch(IOException e){e.printStackTrace();}return s;}
  int    nextInt()   {return Integer.parseInt(next());}
  long   nextLong()  {return Long.parseLong(next());}
  double nextDouble(){return Double.parseDouble(next());}
  char   nextChar()  {return next().charAt(0);}
  int[]  nextIntArray(int n)         {int[] arr= new int[n];   int i=0;while(i<n){arr[i++]=nextInt();}  return arr;}
  long[] nextLongArray(int n)        {long[]arr= new long[n];  int i=0;while(i<n){arr[i++]=nextLong();} return arr;}
  int[]  nextIntArrayOneBased(int n) {int[] arr= new int[n+1]; int i=1;while(i<=n){arr[i++]=nextInt();} return arr;}
  long[] nextLongArrayOneBased(int n){long[]arr= new long[n+1];int i=1;while(i<=n){arr[i++]=nextLong();}return arr;}
  void   close(){try{reader.close();}catch(IOException e){e.printStackTrace();}}
    }
    
    /********* SOLUTION STARTS HERE ************/
    static int a,b,c,d;
    static long ans;
    static long dp[][];
    static long M = 998244353;
    
    static long go(int row, int col) {
        if(dp[row][col]!=-1) return dp[row][col];
        if(row==c && col==d) return dp[row][col] = 1;
        if(row<c && col<d){
            long ans1 = ( go(row + 1, col) * 1L * col ) + (go(row,col+1)*1L*row) - (go(row+1, col+1) * 1L * (row * 1L * col));
            // System.out.println("1. "+row+" "+col+" "+ans1);
            while(ans1 < 0) ans1+=M;
            dp[row][col] = ans1 % M;
            return dp[row][col];
        }
        if(row<c){
            long ans2 = go(row + 1, col) * col;
            // System.out.println("2. "+row+" "+col+" "+ans2);
            while(ans2 < 0) ans2+=M;
            dp[row][col] = ans2 % M;
            return dp[row][col];
        }
        if(col<d){
            long ans3 = go(row, col + 1) * row;
            // System.out.println("3. "+row+" "+col+" "+ans3);
            while(ans3 < 0) ans3+=M;
            dp[row][col] = ans3 % M;
            return dp[row][col];
        }
        return dp[row][col];
    }
    
    private static void solve(FastScanner in, PrintWriter out){
        
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        dp = new long[c+1][d+1];
        for(int i=0;i<=c;i++){
            for(int j=0;j<=d;j++){
                // if(i<=a && j<=b) dp[i][j]=1;
                // else
                dp[i][j]=-1;
            }
        }
        // long p1 = 387222020;
        // long p2 = 309255663;
        // out.println("Diff: "+(p1-p2));
        
        
        for(int i=0;i<=c;i++) Arrays.fill(dp[i], -1);
        ans = go(a, b);
        out.println(ans);
    }
    
    /************* SOLUTION ENDS HERE **********/
}