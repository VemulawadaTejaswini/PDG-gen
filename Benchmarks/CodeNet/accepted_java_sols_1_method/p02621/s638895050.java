import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		short a = Short.parseShort(br.readLine());
		System.out.print((short) (a + Math.pow(a, 2) + Math.pow(a, 3)));
	}
}
