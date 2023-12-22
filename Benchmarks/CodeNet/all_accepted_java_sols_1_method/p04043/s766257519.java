import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String read = br.readLine().replace(" ", "");
		read = read.replaceFirst("5", "");
		read = read.replaceFirst("7", "");
		read = read.replaceFirst("5", "");

		if(read.equals("")) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}