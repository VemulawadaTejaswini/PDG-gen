import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		String inputed = new String();

		while (in.hasNext()) {
			String buf = in.nextLine();
			inputed = inputed + buf;
		}

		String value[] = inputed.split("[\\n]+");
		//int intInputed = Integer.parseInt(inputed);



		while (true) {
			int i = 0;
			int intValue = Integer.parseInt(value[i]);

			if (intValue == 0) { break; }

			System.out.println("case " + (i + 1) + ": " + intValue);
			i++;
		}


	}

}