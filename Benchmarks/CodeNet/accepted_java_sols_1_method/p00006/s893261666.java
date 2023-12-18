import java.io.*;

class Main {
	public static void main(String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try {
			String buf = br.readLine();
			StringBuffer sb = new StringBuffer(buf);
			System.out.println(sb.reverse());
		} catch (Exception e) {
			System.out.println("Exception!");
		}
	}
}