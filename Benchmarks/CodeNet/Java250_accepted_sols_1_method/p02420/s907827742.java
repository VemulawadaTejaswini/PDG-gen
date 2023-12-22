

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String args[]) throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



   while(true){

	  String cards =  br.readLine();
	  if( cards.equals("-") )  break;

      int m = Integer.parseInt(br.readLine());

      for(int i = 0;i < m; i++){
    	  int h = Integer.parseInt(br.readLine());
    	  String left = cards.substring(0, h);	  
    	  String right = cards.substring(h, cards.length());	
          cards = right + left;

      }
      System.out.println(cards);

   }



  }
}