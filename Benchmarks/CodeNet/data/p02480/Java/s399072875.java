import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	private static int x;
	
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		x = Integer.parseInt(br.readLine());
		
		System.out.println(Math.pow(x, 3));
	}
}