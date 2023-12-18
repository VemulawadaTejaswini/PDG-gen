import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = br.readLine()) != null) {
			String[] arr = line.split(" ");
			int m = Integer.parseInt(arr[0]);
			int f = Integer.parseInt(arr[1]);
			int r = Integer.parseInt(arr[2]);
			if (m == -1 && f == -1 && r == -1)
				break;

			if (m == -1 || f == -1)
				System.out.println("F");
			else if (m + f >= 80)
				System.out.println("A");
			else if (m + f >= 65)
				System.out.println("B");
			else if (m + f >= 50)
				System.out.println("C");
			else if (m + f >= 30) {
				if (r >= 50)
					System.out.println("C");
				else
					System.out.println("D");
			} else
				System.out.println("F");
		}
	}
}