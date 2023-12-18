import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1[] = br.readLine().split("");
		String str2[] = br.readLine().split("");

		boolean flag = false;
		for (int i = str1.length - str2.length; i >= 0; i--) {
			flag = false;
			for (int j = 0; j < str2.length; j++) {
				if (!str1[i + j].equals(str2[j]) && !str1[i + j].equals("?")) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.arraycopy(str2, 0, str1, i, str2.length);
				break;
			}
		}

		if (str1.length < str2.length) {
			flag = true;
		}

		if (flag) {
			System.out.println("UNRESTORABLE");
		} else {
			for (int i = 0; i < str1.length; i++) {
				if (str1[i].equals("?")) {
					str1[i] = "a";
				}
				System.out.print(str1[i]);
			}
			System.out.println();
		}
	}
}
