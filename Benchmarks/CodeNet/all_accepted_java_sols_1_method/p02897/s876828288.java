
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int n;
		double ans = 0;
		String str;
		str = bf.readLine();
		n = Integer.parseInt(str);
		if(n % 2 == 0) {
			ans = 0.5;
		} else {
			ans = (double)(n/2 + 1)/n;
		}
		System.out.println(ans);
	}
}