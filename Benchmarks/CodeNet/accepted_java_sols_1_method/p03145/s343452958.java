import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int a[] = new int[3];
		for (int i = 0; i < 3; i++) {
			a[i] = Integer.parseInt(str[i]);
		}
		System.out.println(a[0] * a[1] / 2);
	}
}