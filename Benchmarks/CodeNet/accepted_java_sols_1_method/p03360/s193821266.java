import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Integer;

public class Main {

	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		String[] strArray1 = line.split(" ");
		int[] array1 = new int[3];

		for (int i = 0; i < 3; i++) {
			array1[i] = Integer.parseInt(strArray1[i]);
		}

		line = br.readLine();
		int k = Integer.parseInt(line);

		int max = 0;
		int n = 0;
		int sum = 0;

		for (int i = 0; i < 3; i++) {
			if (max < array1[i]) {
				max = array1[i];
				n = i;
			}
		}

		for (int i = 0; i < 3; i++) {
			if (i != n) {
				sum += array1[i];
			}
		}

		for (int i = 0; i < k; i++) {
			max *= 2;
		}

		System.out.println(max+sum);
	}
}