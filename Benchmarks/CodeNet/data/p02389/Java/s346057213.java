import java.io.*;

class Main{
	
public static void main (String[] args) throws IOException{
	
	BufferedReader r = new BufferedReader (new InputStreamReader (System.in));
		String s = r.readLine();
		int a = Integer.parseInt(s);
		int b = Integer.parseInt(s);
		System.out.println(a * b);
		System.out.println(2 + (a * b));

	}
}