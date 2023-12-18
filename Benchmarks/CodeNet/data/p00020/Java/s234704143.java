import java.io.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader din = new BufferedReader( new InputStreamReader(System.in));
		String str = din.readLine();
		System.out.println(str.toUpperCase());
	}
}