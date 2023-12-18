import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		String[] array1 = str.split(" ");
		int[] array2 = Stream.of(array1).mapToInt(Integer::parseInt).toArray();

		Arrays.sort(array2);

		int m = 0;
		for (int i = 0; i < 2 * n; i += 2) {
			m = m + array2[i];
		}
		System.out.println(m);
	}
}
