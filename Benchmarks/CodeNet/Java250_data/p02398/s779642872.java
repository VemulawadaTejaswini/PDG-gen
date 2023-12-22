import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strIn = br.readLine();
		Integer count = 0;
		for (int i = Integer.parseInt(strIn.split(" ")[0]); i <= Integer.parseInt(strIn.split(" ")[1]); i++) {
			if ((Integer.parseInt(strIn.split(" ")[2]) % i) == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}