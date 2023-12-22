
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] a) {
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		int[] num = new int[2];
		String str;
		try {
			while ((str = br.readLine()) != null) {

				String[] array = str.split(" ");
				for (int h = 0; h < array.length / 2; h++) {
					for (int i = 0; i < 2; i++) {
						num[i] = Integer.parseInt(array[i + h * 2]);
					}
					int answer = (int) Math.log10(num[0] + num[1]) + 1;
					System.out.println(answer);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}