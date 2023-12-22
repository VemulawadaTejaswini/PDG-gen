import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String args[]) throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   String line = br.readLine();
   String[] token = line.split("");


   for (int i = 0; i < token.length; i++){
	   if( Character.isUpperCase(line.charAt(i) )){
		   token[i] = token[i].toLowerCase();
	   }else if( Character.isLowerCase(line.charAt(i)) ){
		   token[i] = token[i].toUpperCase();
	   }
	   System.out.print(token[i]);
   }

   System.out.println();

  }
}