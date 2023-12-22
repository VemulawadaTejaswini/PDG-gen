import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		char[] str = in.readLine().toCharArray();
		str[3] = '8';
		String s = new String(str);
		System.out.println(s);
	}
}
