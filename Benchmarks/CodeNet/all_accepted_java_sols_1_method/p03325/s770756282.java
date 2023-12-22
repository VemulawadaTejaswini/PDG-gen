import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n        = Integer.parseInt(br.readLine());
		String[] tmp = br.readLine().split(" ");
		int cnt      = 0;

		for(int i = 0; i < n; i++) {

			long x = Long.parseLong(tmp[i]);

			while(x % 2 == 0) {

				x /= 2;
				cnt++;
			}

		}


		System.out.println(cnt);

	}
}
