import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			String[] list = br.readLine().split(" ");
			int num01 = Integer.parseInt(list[0]);
			int num02 = Integer.parseInt(list[2]);
			if (list[1].equals("+")) {
				System.out.println(num01 + num02);
			} else if (list[1].equals("-")) {
				System.out.println(num01 - num02);
			} else if (list[1].equals("*")) {
				System.out.println(num01 * num02);
			} else if (list[1].equals("/")) {
				System.out.println(num01 / num02);
			} else {
				break;
			}
		}
	}
}