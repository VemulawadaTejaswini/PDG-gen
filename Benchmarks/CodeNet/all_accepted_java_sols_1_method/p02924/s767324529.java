
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		long ans = 0,n;
		String str;
		str = bf.readLine();
		n = Long.parseLong(str);
		ans = n*(n-1)/2;
		System.out.println(ans);
	}
}