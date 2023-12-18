import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] q = new int[1000000];
		int size = 0;
		for (int i = 0; i < n; i++) {
			String line = br.readLine();

			if (line.startsWith("insert")) {
				q[size] = Integer.parseInt(line.split(" ")[1]);
				size++;
			} else if (line.equals("deleteFirst")) {
				size--;
			} else if (line.equals("deleteLast")) {
				for (int j = 1; j < size; j++) {
					q[j - 1] = q[j];
				}
				size--;
			} else {
				int val = Integer.parseInt(line.split(" ")[1]);
				for (int j = size - 1; j >= 0; j--) {
					if (q[j] == val) {
						for (int k = j; k < size; k++) {
							q[k] = q[k + 1];
						}
						size--;
						break;
					}
				}
			}

			if (i % 100000 == 0) {
				System.gc();
			}
		}

		System.out.print(q[size - 1]);
		for (int i = size - 2; i >= 0; i--) {
			System.out.print(" ");
			System.out.print(q[i]);
		}
		System.out.println();

		if (br != null) {
			br.close();
			br = null;
		}
	}
}