import java.io.*;
import java.util.*;
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String in = r.readLine();
			if(in == null) break;
			String[] s = in.split(" ");
			Arrays.sort(s);
			for(int i = 4; i > 0; i--) {
				System.out.print(s[i] + " ");
			}
			System.out.println(s[0]);
		}
	}
}