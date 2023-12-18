import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		int i = 1;
		while (true) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String inputed = new String(in.readLine());

		String value[] = inputed.split("[\\s]+");
		//int intInputed = Integer.parseInt(inputed);

		int intValue = Integer.parseInt(value[0]);

		if (intValue == 0) { break; }

		System.out.println("case " + i + ": " + intValue);

		i++;
		}


	}

}