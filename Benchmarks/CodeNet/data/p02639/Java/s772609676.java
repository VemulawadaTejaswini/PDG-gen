import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine().replace(" ", "");

		System.out.println(s.indexOf("0") + 1);
	}
}