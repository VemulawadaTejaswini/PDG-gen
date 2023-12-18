import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(is);
		int i = Integer.parseInt(bf.readLine());
		int s = i % 60;
		int m = (i / 60) % 60;
		int h = i / 3600;
		System.out.println(h + ":" + m + ":" + s);
	}
}