import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		try {
			BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));

			String str = stdReader.readLine();
			String[] str1Ary = str.split(" ");
			int a = Integer.parseInt(str1Ary[0]);
			int b = Integer.parseInt(str1Ary[1]);

			String ab = String.valueOf(a + b);

			System.out.println(ab.length());

		} catch (IOException e) {

		}
	}
}