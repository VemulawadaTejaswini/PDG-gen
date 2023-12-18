import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();

		int inputAngka = Integer.parseInt(input);

		for (int i = 0; i < inputAngka; i++) {
			String inputan = br.readLine();

			String[] arr = inputan.split(" ");

			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			int c = Integer.parseInt(arr[2]);

			int ak = (int) Math.pow(a, 2);
			int bk = (int) Math.pow(b, 2);
			int ck = (int) Math.pow(c, 2);

			if (ak + bk == ck) {
				System.out.println("YES");
			} else if (ak + ck == bk) {
				System.out.println("YES");
			} else if (ck + bk == ak) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}

}