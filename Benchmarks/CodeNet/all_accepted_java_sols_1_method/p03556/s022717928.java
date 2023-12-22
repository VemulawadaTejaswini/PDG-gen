
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String strN = bufferedReader.readLine();
		int n = Integer.parseInt(strN);
		int a = n;
		while(a>0) {
			if((int) Math.sqrt(a) == Math.sqrt(a)) {
				break;
			}
			a--;
		}

		System.out.println(a);

	}

}
