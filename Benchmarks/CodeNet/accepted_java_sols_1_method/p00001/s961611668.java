import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	public static void main(String[] a) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] mt = new int[10];
		try {
			for (int i = 0; i < mt.length; i++) {
				mt[i] = Integer.parseInt(br.readLine());
			}
		} catch (Exception e) {
		}

		Arrays.sort(mt);

		System.out.println(mt[9]);
		System.out.println(mt[8]);
		System.out.println(mt[7]);
	}
}