

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String args[]) throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   int n = Integer.parseInt(br.readLine());
   int TarouP = 0;
   int HanakoP = 0;

   for(int i = 0; i < n;i++){

	   String[] token = br.readLine().split(" ");

	   if(  token[0].compareTo( token[1] ) > 0 ){//??????:0?????±???:1

	       TarouP += 3;

	   }else if(token[0].compareTo( token[1] ) < 0 ){

		   HanakoP += 3;

	   }else{
		   TarouP++;
		   HanakoP++;
	   }


   }

   System.out.println(TarouP+" "+HanakoP);

  }
}