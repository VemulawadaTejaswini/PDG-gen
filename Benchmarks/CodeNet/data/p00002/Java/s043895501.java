import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while(null != (s = r.readLine() ) ){
			String[] ss = s.split(" ");
			int a = (int)Math.log10( Integer.parseInt(ss[0]) ) + 1;
			int b = (int)Math.log10( Integer.parseInt(ss[1]) ) + 1;
			System.out.println( (a+b) );
		}
	}
}