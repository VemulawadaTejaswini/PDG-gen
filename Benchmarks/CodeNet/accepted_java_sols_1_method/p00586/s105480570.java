import java.io.*;

public class Main {

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