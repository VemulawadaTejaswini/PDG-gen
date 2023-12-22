

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String args[]) throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

   int[] Alph = new int[26];

   for(int j = 0; j < 26; j++){
	   Alph[j] = 0;
   }

 while(true){
	 String line = br.readLine();
	 if(line == null ) break;

	 String[] token = line.split("");
	 for (int i = 0; i < token.length; i++){
		   String str = token[i].toLowerCase();

		   for(char ch:  str.toCharArray()){
		     if(Character.isLetter(ch)){
			   Alph[ch - 'a'] ++;
		     }
		   }
	   }

 }

   for(int i = 0; i<26 ; i++){
	   System.out.println( (char)('a'+i) + " : " + Alph[i] );
   }



  }
}