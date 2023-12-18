import java.io.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader din = new BufferedReader( new InputStreamReader(System.in));
		int n = Integer.parseInt(din.readLine());
		for ( int i = 0; i < n; i++ ) {
			String str = din.readLine();
			System.out.println(str.replace("Hoshino","Hoshina"));
		}
	}
}