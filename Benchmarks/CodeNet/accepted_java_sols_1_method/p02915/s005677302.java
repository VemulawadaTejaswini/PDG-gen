
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int ans = 0,n;
		String str;
		str = bf.readLine();
		n = Integer.parseInt(str);
		ans = n*n*n;
		System.out.println(ans);
	}
}