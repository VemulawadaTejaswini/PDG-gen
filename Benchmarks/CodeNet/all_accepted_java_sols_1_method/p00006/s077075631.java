import java.io.*;

class Main {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		while (str != null) {
			StringBuffer strBuffer = new StringBuffer(str);
			str = strBuffer.reverse().toString();
			System.out.println(str);
			str = br.readLine();
		}
	}
}