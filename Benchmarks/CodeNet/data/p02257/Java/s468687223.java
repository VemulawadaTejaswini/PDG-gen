


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String args[]) throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

   long n = Integer.parseInt( br.readLine() );

   int answer = 0;

   for(int i = 0 ; i < n; i++){
      long x = Integer.parseInt( br.readLine() );

      if(x != 1){
          int flag = 0;
    	  for(long j = 2;j < x; j++){
    		  if( x % j == 0){
    			  flag = 1;
    			  break;
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