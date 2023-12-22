
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");

		int A = Integer.parseInt(str[0]);
		int P = Integer.parseInt(str[1]);

		P += A*3;

		int ans = (P-(P%2))/2;

		System.out.print(ans);

	}

}
