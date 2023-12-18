import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			String s[] = str.split(" ");
			int n = Integer.parseInt(s[0]);
			int k = Integer.parseInt(s[1]);
			String ss = br.readLine();

			String s1 = ss.substring(0, k - 1);
			String s2 = ss.substring(k - 1, k);
			String s3 = ss.substring(k, ss.length());

			System.out.println(s1 + s2.toLowerCase() + s3);

			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}