

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String args[]) throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   String serch =  br.readLine().toUpperCase();

   int serchcount = 0;
   while(true){

	  String original =  br.readLine();
	  if( original.equals("END_OF_TEXT") ) break;


     String[] cut =  original.toUpperCase().split(" ");


	 for(int i = 0 ;i < cut.length;i++){

		 if( cut[i].equals(serch) )  serchcount++;

	 }

   }


   System.out.println(serchcount);
  }
}