import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {

		int a = 0;
		int b = 0;
		int c = 0;

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] tokens = line.split(" ");
				a = Integer.parseInt(tokens[0]);
				b = Integer.parseInt(tokens[1]);
				c = Integer.parseInt(tokens[2]);
			}
		}

		List<Integer> aList = new ArrayList();
		List<Integer> bList = new ArrayList();
		List<Integer> cList = new ArrayList();

		aList.add(a);
		bList.add(b);
		cList.add(c);

		int count = 0;
		while(true) {

			if (a % 2 == 1 || b % 2 == 1 || c % 2 == 1) {
				break;
			}

			int a2 = (b / 2) + (c / 2);
			int b2 = (a / 2) + (c / 2);
			int c2 = (a / 2) + (b / 2);

			a = a2;
			b = b2;
			c = c2;

			int l = aList.size();
			for (int i = 0; i < l; i++) {
				if (aList.get(i) != a) {
					continue;
				}
				if (bList.get(i) != b) {
					continue;
				}
				if (cList.get(i) != c) {
					continue;
				}

				count = -1;
			}

			if (count != -1) {
				count++;
			} else {
				break;
			}

			aList.add(a);
			bList.add(b);
			cList.add(c);
		}

		System.out.println(count);
	}
}