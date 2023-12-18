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
public class Main{

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\?????????
		    String str = br.readLine();
		    double r =  Double.parseDouble( str);
		    double men = (double) r *r *Math.PI;
		    double syu = (double) r*2* Math.PI;
		   // System.out.println(Math.PI);
		    System.out.printf( "%.6f %.6f",men , syu );


	}

}