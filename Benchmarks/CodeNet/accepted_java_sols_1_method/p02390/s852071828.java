import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int intIn = new Integer(in.readLine());
		if(intIn < 0 || intIn > 86400) {
			return;
		}
		int h = intIn / 3600;
		int m = (intIn - h * 3600) / 60;
		int s = intIn - (h * 3600 + m * 60);
		System.out.println(h + ":" + m + ":" + s);

	}

}

