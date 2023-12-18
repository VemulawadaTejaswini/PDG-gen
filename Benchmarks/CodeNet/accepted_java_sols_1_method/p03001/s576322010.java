
import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		long W = Long.parseLong(tokens[0]);
		long H = Long.parseLong(tokens[1]);
		long x = Long.parseLong(tokens[2]);
		long y = Long.parseLong(tokens[3]);
		int status = 0;
		if (x * 2 == W && y * 2 == H) {
			status = 1;
		}
		double result = (double) W * (double) H / 2.0;
		System.out.println(result + " " + status);

		in.close();
	}

}
