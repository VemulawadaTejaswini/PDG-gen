import java.io.*;

class Main {
	public static void main (String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf;
		int count = 1;

		try {
			while ((buf = br.readLine())!=null) {
				System.out.println("Case "+count+": "+Integer.parseInt(buf));
				count++;
			}
		} catch (Exception e) {
			//Exception
		}
	}
}