
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		int cnt = 0;
		for(;;) {
			cnt++;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String num = br.readLine();

			if (num.equals("0")) {
				break;
			} else {
				System.out.println("Case " + cnt + ": " + num);
			}
		}

	}

}