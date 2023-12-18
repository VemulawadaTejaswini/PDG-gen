import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		    try {
			    input = br.readLine();
		        
		    } catch (IOException e) {
	    	}
		    double r = Double.parseDouble(input) ;
		    System.out.printf("%f %f\n", r * r * Math.PI , r * 2 * Math.PI);
		    // %fはdoubleの時にprintf内の小数を表示したいときに使う。
		    // 使いたい個数分書いて、空白を入れたいときは%fとか%dとかの間に空白入れるだけ
	}
}
