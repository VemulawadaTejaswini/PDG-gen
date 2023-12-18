import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] d = str.split(" ");
		int a = Integer.parseInt(d[0]) - 1;
		int b = Integer.parseInt(d[1]) - 1;
		System.out.println(a * b);
	}
}
