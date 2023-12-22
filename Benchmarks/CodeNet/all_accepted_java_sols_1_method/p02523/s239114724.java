import static java.lang.Double.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		String[] in = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
		System.out.printf("%.8f", Math.sqrt(Math.pow(parseDouble(in[2]) - parseDouble(in[0]), 2) + Math.pow(parseDouble(in[3]) - parseDouble(in[1]), 2)));
	}
}