


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
      int flag = 0;

      if(x == 2){
    	flag = 0;

      }else if( x%2 == 0 || x < 2){
    	flag = 1;

       }else{

       double sqrt = Math.sqrt(x);
       for(int j = 3; j <= sqrt; j = j+2){
    	 if(x % j ==0){
    		flag = 1;

    		break;
    	 }
        }

       }


    	if(flag == 0){

    		answer++;

    	}

   }



   System.out.println(answer);
 }
}