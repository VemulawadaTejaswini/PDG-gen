import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
	public static void main(String args[]) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(in.readLine());
		System.out.println(x*x*x);
	}
}