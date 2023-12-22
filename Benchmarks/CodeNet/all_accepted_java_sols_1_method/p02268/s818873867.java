
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {


   public static void main(String args[]) throws IOException{

	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	   int n = Integer.parseInt( br.readLine() );
	   String[] string =  br.readLine().split(" ");
       int[] S = new int[n];


       for(int i = 0; i < n; i++ ){

    	   S[i] = Integer.parseInt( string[i] );

       }

       int q = Integer.parseInt( br.readLine() );
	   String[] stringq =  br.readLine().split(" ");
       int[] T = new int[q];


       for(int i = 0; i < q; i++ ){

    	   T[i] = Integer.parseInt( stringq[i] );

       }


       int answer = 0;

       for(int i = 0; i < q ; i++ ){
    	   for(int j = 0; j < n ;  j++ ){
    		   if( S[j] == T[i]  ){
    			   answer++;
    			   break;
    		   }
    	   }

       }

     System.out.println(answer);


   }


}