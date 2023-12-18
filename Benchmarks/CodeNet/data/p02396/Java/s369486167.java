import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		int i = 0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String inputed = new String(in.readLine());

		String value[] = inputed.split("[\\n]+");
		//int intInputed = Integer.parseInt(inputed);


		while (true) {
		int intValue = Integer.parseInt(value[i]);
		if (intValue == 0) { break; }

		System.out.println("case " + (i + 1) + ": " + intValue);

		i++;
		}


	}

}