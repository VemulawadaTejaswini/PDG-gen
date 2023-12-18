import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Integer top3[] = new Integer[3];
		for (int i = 0; i < 3; i++) {
			top3[i] = 0;
		}

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for (int x = 1; x <= 10; x++) {
			Integer h = Integer.parseInt(in.readLine());
			if (h >= 0 && h <= 10000) {
				ArrayList<Integer> tmpTop = new ArrayList<Integer>(4);
				for (int i = 0; i< 3; i++) {
					tmpTop.add(top3[i]);
				}
				tmpTop.add(h);

				Collections.sort(tmpTop);
				Collections.reverse(tmpTop);

				for (int i = 0; i< 3; i++) {
					top3[i] = tmpTop.get(i);
				}
			}
		}

		for (int i = 0; i< 3; i++) {
			System.out.println(top3[i]);
		}
	}

}