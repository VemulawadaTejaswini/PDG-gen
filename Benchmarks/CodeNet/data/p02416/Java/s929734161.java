import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while(!"0".equals(str = br.readLine())){
			System.out.println(sum(Integer.parseInt(str)));
		}
	}

	private static int sum(int n) {
		if (n < 10) {
			return n;
		} else {
			return (n % 10) + sum(n / 10);
		}
	}
}