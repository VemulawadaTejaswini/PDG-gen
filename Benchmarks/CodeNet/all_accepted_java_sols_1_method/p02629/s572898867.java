import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	Scanner s = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] input;
		long n = Long.parseLong(reader.readLine());
		StringBuffer strbf = new StringBuffer();
		while(n > 0) {
			n--;
			strbf.append((char)('a' + n % 26));
			n /= 26;
		}
		out.print(strbf.reverse().toString());
		out.flush();
		out.close();
    }
}
