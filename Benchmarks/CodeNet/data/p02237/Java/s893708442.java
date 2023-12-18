
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

   static int n;
	public static void main( String args[] ) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         n =  Integer.parseInt( br.readLine() );

         int[][] V = new int[n+1][n+1];

         for(int i = 1; i <= n; i++){
        	 for(int j = 1; j <= n; j++){
        		 V[i][j] = 0;
             }

         }



         for(int i = 1; i <= n; i++){

        	 String[] order =  br.readLine().split(" ");


        	 if( Integer.parseInt( order[1] ) > 0){

        		 for(int j = 0; j < order.length-2; j++){
                        V[i][Integer.parseInt( order[2+j] )] = 1;
        		 }

             }

         }



         for(int i = 1; i <= n; i++){
        	 for(int j = 1; j <= n; j++){
        		 System.out.print( V[i][j] +" ");
             }
        	 System.out.println();
         }


	}




}