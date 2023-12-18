import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class culcurator {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
		String data[] = br.readLine().split(" ");
		int a = Integer.parseInt(data[0]);
		int b = Integer.parseInt(data[2]);

		String s = (data[1]);
		if(s.equals("?"))break;

		else if (s.equals("+")) {
			System.out.println(a + b);
			}
		else if (s.equals("-")) {
			System.out.println(a - b);
			}

		else if (s.equals("*")) {
			System.out.println(a * b);
			}
		else if (s.equals("/")) {
			System.out.println(a / b);
		}
	}
  }
}