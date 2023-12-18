package v10.p1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a;
		int b;

		try {
			String line = null;
			for(;;) {
				BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
				line = stdReader.readLine();

				if(line != null){
					StringTokenizer aSt = new StringTokenizer(line," ");
					a = Integer.parseInt(aSt.nextToken());
					b = Integer.parseInt(aSt.nextToken());

					System.out.println(a + b);
				}
			}

		} catch (IOException e) {

		}
	}
}