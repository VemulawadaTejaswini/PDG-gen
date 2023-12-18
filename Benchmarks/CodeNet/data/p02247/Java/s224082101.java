import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String args[] ) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] origin = br.readLine().split("");
		String[] serch = br.readLine().split("");


		for(int i = 0; i < origin.length; i++){

			if(origin[i].equals(serch[0])){
				int ans = i;
                int wordlength = 0;
                 for(int j = 0 ; j < serch.length;j++  ){

                	 if(i+j < origin.length){
                	   if(serch[j].equals(origin[i+j]) ){
                		 wordlength++;
                	  }
                	 }
                 }

                 if( wordlength == serch.length ){
                     System.out.println(ans);
                 }
			}


		}





	}

}