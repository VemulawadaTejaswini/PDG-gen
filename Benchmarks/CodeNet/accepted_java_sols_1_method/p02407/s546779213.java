import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		reader.readLine();

		List<String> a = Arrays.asList(reader.readLine().split(" "));
		Collections.reverse(a);

		System.out.println(String.join(" ", a));
	}
}

