import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String[] inputNum = br.readLine().split(" ");

			int a = Integer.parseInt(inputNum[0]);
			int b = Integer.parseInt(inputNum[2]);

			if (inputNum[1].equals("+")) {
				System.out.println(a + b);
			}else if (inputNum[1].equals("-")) {
				System.out.println(a - b);
			}else if (inputNum[1].equals("*")) {
				System.out.println(a * b);
			}else if (inputNum[1].equals("/")) {
				System.out.println(a / b);
			}else if (inputNum[1].equals("?")) {
				break;
			}
		}

	}

}