import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String strIn = new String(in.readLine());
		String[] strArray = strIn.split(" ", 2);
		int a = Integer.parseInt(strArray[0]), b = Integer.parseInt(strArray[1]);
		if(a < 1 || a > 100) {
			return;
		}
		if(b < 1 || b > 100) {
			return;
		}
		System.out.println((a * b) + " " + ((a + b) * 2));

	}

}

