import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	String buf = br.readLine();
	double x = Double.parseDouble(buf);
	double y = Math.pow(x, 3);
        System.out.println(y);
	}
}