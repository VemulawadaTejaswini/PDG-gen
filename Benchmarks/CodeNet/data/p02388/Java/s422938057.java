import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(is);
		int x = Integer.parseInt(bf.readLine());
		double db = Math.pow(x, 3);
		System.out.println((int)db);
	}
}