import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author cthanh
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String str = br.readLine();
	  
	    String[] strAry = str.split(" ");
	    int H = Integer.parseInt(strAry[0]);
	  	int W = Integer.parseInt(strAry[1]);
        int i,j ;
	  	 for ( i = 1 ; i<=H && H!= 0; i++ ){
	  		for ( j=1; j<= W && W !=0; j++){
	  			System.out.printf("#");
	  			
	  		}
	  		 System.out.printf("\n");
	  	}
	}

}