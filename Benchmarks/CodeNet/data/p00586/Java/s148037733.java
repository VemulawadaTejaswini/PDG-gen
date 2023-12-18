import java.io.*;

public class AOJ1000 {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

		String s;
		String t[];
		while((s = r.readLine()) != null){
			t = s.split("[ ]");
			System.out.println(Integer.parseInt(t[0])+ Integer.parseInt(t[1]));
		}
	}
}