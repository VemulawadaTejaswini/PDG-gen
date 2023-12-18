import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 */

/**
 * @author cthanh
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] c = str.toCharArray();
		for (int i=0; i< c.length; i++)
		System.out.println(c[i]);

		for (int i = 0; i < c.length; i++) {

			if (Character.isLowerCase(c[i])) {
			System.out.print(Character.toUpperCase(c[i]));
		;
			} else {
			System.out.print(Character.toLowerCase(c[i]));}
		}
//		for (int i = 0; i < str.length; i++)
//			System.out.print(str[i]);
	}

}