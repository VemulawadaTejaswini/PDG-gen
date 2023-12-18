

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String args[]) throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   String serch =  br.readLine();

   int serchcount = 0;
   while(true){
	   String original =  br.readLine();
     String[] cut =  original.split(" ");
	 if( original.equals("END_OF_TEXT") ) break;

	 for(int i = 0 ;i < cut.length;i++){

		 if( cut[i].equals(serch) )  serchcount++;

	 }

   }


   System.out.println(serchcount);
  }
}