


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String args[]) throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

   int n = Integer.parseInt( br.readLine() );

   int answer = 0;

   for(int i = 0 ; i < n; i++){
      int x = Integer.parseInt( br.readLine() );

      if(x != 1){
          int flag = 0;
    	  for(int j = 1;j < x; j++){
    		  if(j != 1 && x % j == 0){
    			  flag = 1;
    		  }
    	  }
    	  if(flag == 0){

    		  answer++;

    	  }
      }
   }





   System.out.println(answer);
 }
}