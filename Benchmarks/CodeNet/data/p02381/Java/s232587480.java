import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String args[]) throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

   double alph;

   while(true){

	   String st = br.readLine();
	   if( st.equals("0") ) break;
       double n = Double.parseDouble( st );
       String[] s = br.readLine().split(" ");

       double sum = 0;
       for(int i = 0; i < n ; i++){
    	   sum += Double.parseDouble( s[i] );
       }

       double ave = sum / n;

       double sigma = 0;

       for(int i = 0; i < n ; i++){
    	   sigma += Math.pow(Double.parseDouble( s[i] ) - ave , 2) ;
       }

       alph =Math.sqrt (sigma / n );
       System.out.println(alph);

   }


  }
}