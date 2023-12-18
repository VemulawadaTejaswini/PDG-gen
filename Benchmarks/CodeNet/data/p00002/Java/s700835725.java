import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] arrays;
		int a, b;
		while ((line = br.readLine()) != null) {
			arrays = line.split(" ");
			a = Integer.parseInt(arrays[0]);
			b = Integer.parseInt(arrays[1]);
			System.out.println(String.valueOf(a+b).length());
		}
	}
}