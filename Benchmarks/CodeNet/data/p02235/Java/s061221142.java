import java.io.*;
import static java.lang.Math.max;
import static java.lang.Integer.parseInt;

class Main {
   final static PrintWriter out = new PrintWriter( System.out );

   final static BufferedReader in =
         new BufferedReader( new InputStreamReader( System.in ) );

   final static StringBuilder sb = new StringBuilder("");

   static int lcs(char[] a, char[] b){
      final int alen = a.length;
      final int blen = b.length;
      int dp[][] = new int[alen+1][blen+1];

      for(int i=0; i<alen; ++i){
         for(int j=0; j<blen; ++j){
            if(a[i] == b[j])
               dp[i+1][j+1] = dp[i][j] + 1;
            else
               dp[i+1][j+1] = max( dp[i][j+1], dp[i+1][j] );
         }
      }
      return( dp[alen][blen] );
   }

   public static void main(String[] args) throws IOException {
      final int N = parseInt( in.readLine() );
      for(int i=0; i<N; ++i){
         char[] a = in.readLine().toCharArray();
         char[] b = in.readLine().toCharArray();
         sb.append( lcs(a,b) );
         sb.append('\n');
      }
      System.out.print(sb);
   }
}


