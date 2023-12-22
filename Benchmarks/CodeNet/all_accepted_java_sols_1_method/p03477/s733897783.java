
import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		String[] tokens = in.readLine().split(" ");
		int A = Integer.parseInt(tokens[0]);
		int B = Integer.parseInt(tokens[1]);
		int C = Integer.parseInt(tokens[2]);
		int D = Integer.parseInt(tokens[3]);

		if (A + B < C + D) {
			System.out.println("Right");
		} else if (A + B > C + D) {
			System.out.println("Left");
		} else {
			System.out.println("Balanced");
		}
	}
}