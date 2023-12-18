import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int A;
	static int B;
	public static void main(String[] args) throws NumberFormatException, IOException {
		read();
	}

	private static void read() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] word = br.readLine().split("\\s+");
		A = Integer.parseInt(word[0]);
		B = Integer.parseInt(word[1]);
		System.out.println(A*B);
		br.close();
	}

}
