import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws Exception {
try {
	BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	String input = buf.readLine();
	
	String[] strAry = input.split(" ");
    int a = Integer.parseInt(strAry[0]);
    int b = Integer.parseInt(strAry[1]);

    int d = a/b;
    int r = a%b;
    double f = 1.0 *  a/b;
    
    System.out.printf("%d %d %.5f\n", d, r, f);

} catch (Exception e) {
	// TODO: handle exception
}
		 }
    }