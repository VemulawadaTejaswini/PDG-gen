import java.io.*;
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer(r.readLine());
		System.out.println(sb.reverse().toString());
	}
}