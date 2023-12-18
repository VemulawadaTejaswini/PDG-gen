import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

class Main {


   public static void main(String args[]) throws IOException{


	   StringBuilder answer = new StringBuilder();
	   HashSet<String> Dictionary = new HashSet<String>();



	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	   int n = Integer.parseInt( br.readLine() );

       for(int i = 0; i < n; i++  ){

    	   String[] order = br.readLine().split(" ");

    	   if( order[0].equals("insert") ){
    		   Dictionary.add(order[1]);
    	   }
    	   else if( order[0].equals("find") ){

    		   if (Dictionary.contains(order[1])) {
                  answer.append("yes\n");
    			}
    		   else{
    			   answer.append("no\n");
    		   }

    	   }

       }




       System.out.println(answer);

   }

}