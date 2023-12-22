import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		StringTokenizer st = new StringTokenizer(in.readLine());
		String s = st.nextToken(), t = st.nextToken();
		String r = "";
		for(int i = 0; i < n; i++) {
			r += s.charAt(i);
			r += t.charAt(i);
		}
		System.out.println(r);
	}
	
}



