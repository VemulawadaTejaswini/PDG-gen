import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;

class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader  br = new BufferedReader(is);
		while (true) {
			String[] strAry = br.readLine().split(" ");
			if (strAry[0].equals("0") && strAry[1].equals("0")) {
				break;
			} else {
				Arrays.sort(strAry);
				System.out.println(strAry[0] + " " + strAry[1]);
			}
		}
	}
}