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

        while (H != 0 || W != 0){
        for ( i = 0 ; i<H && H!= 0; i++ ){
	  		for ( j=0; j< W && W !=0; j++){
	  			System.out.printf("#");

	  		}
	  		 System.out.printf("\n");

	  	}
	  	 System.out.printf("\n");
	       str = br.readLine();

		   strAry = str.split(" ");
		   H = Integer.parseInt(strAry[0]);
		   W = Integer.parseInt(strAry[1]);

	}
	}
}