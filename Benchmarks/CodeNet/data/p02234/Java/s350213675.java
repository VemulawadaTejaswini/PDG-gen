
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

   static int n;
   static Matrix[] matrix;
   static Matrix result  ;
   static int[][] DP;
   static int[] p;

	public static void main( String args[] ) throws IOException {

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         n =  Integer.parseInt( br.readLine() );
         matrix = new Matrix[n];
          DP = new int[101][101];
          p = new int[n + 1];


         String string = br.readLine();
         p[0] = Integer.parseInt(string.split(" ")[0] );
         p[1] = Integer.parseInt(string.split(" ")[1] );

         for(int i = 2; i <= n ; i++){

             String order =  br.readLine();
             p[i] = Integer.parseInt(order.split(" ")[1] );
         }

         for(int i = 1; i < n ; i++){
            // System.out.println("i = "+i + " p = "+p[ i +1]);
        	 DP[i][i] = 0;
        	 DP[i][i+1] = p[ i-1 ]*p[ i ]*p[ i+1 ];
         }


          for(int j = 0; j <= n-3 ; j++){
        	  for( int i = 3+j; i <= n ; i++ ){
        		  //System.out.println("i-2-j = "+(i-2-j) + " i = "+i);
        		  DP[i-2-j][i] = rec(i-2-j, i);
        	  }

          }



          System.out.println(DP[1][n]);

	}


          public static int rec(int r, int c){

        	  int Min = Integer.MAX_VALUE;
        	  int num = c - r;

        	  for(int i = 0;i < num;i++ ){
                    Min = Math.min( Min, DP[r][r+i] + DP[r+i+1][c] + p[r-1]*p[r+i]*p[c]);
        	  }
        	  return Min;

          }


}


class Matrix{

	int ROW;//???
    int COLUMN;//???

    Matrix(int x, int y){

    	ROW = x;
    	COLUMN = y;
	}


}