import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String k = br.readLine();

		String ans;
		if(n >= k.length()) {

			ans = k;
		}else {

			ans = k.substring(0, n ) + "...";
		}

		System.out.println(ans);

	}
}
