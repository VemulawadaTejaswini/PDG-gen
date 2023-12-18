import java.io.*;
import java.util.*;
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String[] s = r.readLine().split(" ");
		Arrays.sort(s);
		for(int i = 4; i > 0; i--) {
			System.out.print(s[i] + " ");
		}
		System.out.println(s[0]);
	}
}