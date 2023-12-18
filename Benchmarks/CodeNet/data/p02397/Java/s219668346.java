import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while ((line = br.readLine()) != null) {
			String[] arr = line.split(" ");
			if ("0".equals(arr[0]) && "0".equals(arr[1]))
				break;
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);

			if (a > b)
				System.out.println(b + " " + a);
			else
				System.out.println(a + " " + b);
		}
	}
}