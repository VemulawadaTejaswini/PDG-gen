import java.io.*;
import static java.lang.Math.*;
import static java.lang.Integer.parseInt;

class Main {
   final static PrintWriter out = new PrintWriter( System.out );

   final static BufferedReader in =
         new BufferedReader( new InputStreamReader( System.in ) );

   static int lcs(String a, String b){
      final int alen = a.length();
      final int blen = b.length();
      int dp[][] = new int[alen+1][blen+1];
      int maxl = 0;

      for(int i=0; i<alen; ++i){
         for(int j=0; j<blen; ++j){

            if( a.charAt(i) == b.charAt(j) )
               dp[i+1][j+1] = dp[i][j] + 1;
            else
               dp[i+1][j+1] = max( dp[i][j+1], dp[i+1][j] );

            maxl = max(maxl, dp[i+1][j+1]);
         }
      }
      return (maxl);
   }

   public static void main(String[] args) throws IOException {
      final int N = parseInt( in.readLine() );
      for(int i=0; i<N; ++i){
         String a = in.readLine();
         String b = in.readLine();
         out.println( lcs(a,b) );
      }
      out.flush();
   }
}


