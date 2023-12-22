import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		// 一行目
		String s = bf.readLine().replace(" ", "");
		double tmp = Math.sqrt(Integer.parseInt(s));
		tmp -= (int)tmp;
		System.out.println((tmp > 0) ? "No" : "Yes");


	}
}
