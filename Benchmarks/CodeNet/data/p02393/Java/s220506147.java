import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] arr = line.split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);
		List<Integer> l = Arrays.asList(a, b, c);
		Collections.sort(l);
		for (int i = 0; i < l.size(); i++) {
			if (i != 0) {
				System.out.print(" ");
			}
			System.out.print(l.get(i));
		}
		System.out.println();
	}
}