import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		String s = buf.readLine();
    	String[] strlAry =s.split(" ");
    	for(int i=0;i<strlAry.length;i++){
   	    }
   	    double r = Integer.parseInt(strlAry[0]);

   	    double l=r*r*Math.PI;
   	    double m=2*Math.PI*r;

   	    
//この部分パクリました。
   	    String Area = String.format("%.5f", l);
   	    String Length = String.format("%.5f", m);
   	    System.out.println(Area+" "+Length);
 	}
}