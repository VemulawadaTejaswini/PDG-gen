import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	String buf = br.readLine();
	int x = Integer.parseInt(buf);
	int y = (int) Math.pow(x,3);
	System.out.println(y);
	}
}