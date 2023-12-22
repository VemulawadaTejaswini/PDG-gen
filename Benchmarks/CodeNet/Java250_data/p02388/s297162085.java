import java.io.*;

class Main {
	public static void main(String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try {
			String buf = br.readLine();
			int x = Integer.parseInt(buf);
			System.out.println((int)Math.pow(x,3));
		} catch (IOException e) {
			System.out.println("IOException!");
		}
	}
}