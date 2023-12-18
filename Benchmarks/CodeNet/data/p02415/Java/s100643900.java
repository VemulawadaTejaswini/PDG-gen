

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		char[] strArray = str.toCharArray();

		for (int i = 0; i < strArray.length; i++) {

			if (Character.isUpperCase(strArray[i])) {

				strArray[i] = Character.toLowerCase(strArray[i]);

			} else if (Character.isLowerCase(strArray[i])) {

				strArray[i] = Character.toUpperCase(strArray[i]);

			} else {

				strArray[i] = strArray[i];

			}

		}

		for (int i = 0; i < strArray.length - 1; i++) {

			System.out.print(strArray[i]);

		}

		System.out.println(strArray[strArray.length - 1]);

	}
}