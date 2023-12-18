import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String args[]) throws IOException{

   int n,m,l;
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


   while(true){

	   String line = br.readLine();
	   String[] token = line.split("");
	   if(line.equals("0")) break;
	   int sum = 0;
	   for(int i = 0; i < token.length;i++){
		   sum += Integer.parseInt( token[i] );
	   }

	   System.out.println(sum);

   }


  }
}