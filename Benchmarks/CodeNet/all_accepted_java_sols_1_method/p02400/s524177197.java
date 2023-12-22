import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws Exception {
try {
	BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	String input = buf.readLine();
	
	String[] strAry = input.split(" ");
    double r = Double.parseDouble(strAry[0]);
    double x = r*r*Math.PI;
    double y = 2*r*Math.PI;

System.out.printf("%5f %5f", x, y);

} catch (Exception e) {

	System.out.println("????????????");
	
}
		 }
    }