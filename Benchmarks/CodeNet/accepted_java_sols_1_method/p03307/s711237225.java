import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws Exception {
		long N = Long.parseLong(br.readLine());
		
		if(N % 2 == 0)
			pw.println(N);
		else
			pw.println(N*2);
		
		pw.close();
	}
}