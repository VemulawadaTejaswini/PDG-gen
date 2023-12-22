import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader  br = new BufferedReader(is);
		while (true) {
			String[] strAry = br.readLine().split(" ");
			int a = Integer.parseInt(strAry[0]);
			int b = Integer.parseInt(strAry[1]);
			if (a == 0 && b == 0) {
				break;
			} else if (a < b) {
				System.out.println(a + " " + b);
			} else if (b < a) {
				System.out.println(b + " " + a);
			} else if (a == b) {
				System.out.println(a + " " + b);
			}
		}
	}
}