

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String args[]) throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

   String original = br.readLine();
   int n = Integer.parseInt(br.readLine());


   for(int i = 0; i < n;i++){

	   String[] order = br.readLine().split(" ");

	   if( order[0].equals("print") ){

		   String print = original.substring( Integer.parseInt(order[1]), Integer.parseInt(order[2])+1 );
		   System.out.println(print);

      }else if( order[0].equals("reverse") ){
    	  String left = original.substring( 0, Integer.parseInt(order[1]));
    	  String right = original.substring(Integer.parseInt(order[2])+1 , original.length());
    	  StringBuffer before = new StringBuffer( original.substring( Integer.parseInt(order[1]) , Integer.parseInt(order[2])+1 ) );
    	  String reverse = before.reverse().toString();
    	  original = left + reverse + right;

      }else{

    	  String left = original.substring( 0, Integer.parseInt(order[1]));
    	  String right = original.substring(Integer.parseInt(order[2])+1 , original.length());
    	  original = left + order[3] + right;


      }
   }


  }
}