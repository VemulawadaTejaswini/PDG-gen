import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = in.readLine();
		StringTokenizer tk = new StringTokenizer(line);
		String toReverse = tk.nextToken();
		char[] revArray = new char[toReverse.length()];
		for (int i = 0; i < toReverse.length(); i++) {
			revArray[toReverse.length()-1-i] = toReverse.charAt(i);
		}
		System.out.println(new String(revArray));
	}
}