import java.io.*;
import java.util.StringTokenizer;

class Main {
    private static final double G = 9.8;

    public static void main(String args[]) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String buf;

	try {
	    while ((buf = br.readLine())!=null) {
		double v = Double.parseDouble(buf);
		double t = v/G;
		double y = (G/2)*t*t;
		double N = (y+5)/5;
		System.out.println((int)Math.ceil(N));
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    } 
}