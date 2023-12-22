import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String p = br.readLine();
		String ring = s + s;
		if (ring.indexOf(p) == -1) System.out.println("No");
		else System.out.println("Yes");
	}
}