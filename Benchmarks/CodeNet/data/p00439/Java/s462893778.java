import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * Maximum Sum
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int n, k, sum = 0, max = 0;
		short s;
		LinkedList<Short> list1, list2;

		while ((line = br.readLine()) != null) {
			n = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			k = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
			list1 = new LinkedList<Short>();
			list2 = new LinkedList<Short>();
			for (int i = 0; i < n; i++) {
				s = Short.parseShort(br.readLine());
				if (i < n - k + 1)
					list1.add(s);
				if (i > k - 1)
					list2.add(s);
			}
			for (int i = 0; i < k; i++) {
				max += list1.get(i);
			}
			for (int i = 0; i < n - k; i++) {
				sum = max - list1.removeFirst() + list2.removeFirst();
				if (sum > max)
					max = sum;
			}
			System.out.println(max);
		}

	}

}