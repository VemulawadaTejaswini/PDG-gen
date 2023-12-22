import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split("");

		long k = Long.parseLong(br.readLine());

		long one = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("1")) {
				one++;
			} else {
				break;
			}
		}

		if (one >= k) {
			System.out.println("1");
		} else {
			System.out.println(str[(int) one]);
		}
	}
}
