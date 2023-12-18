import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

		while((str = br.readLine()) != null) {
			String num[] = str.split(" ", 0);
			int x = Integer.parseInt(num[0]);
			int y = Integer.parseInt(num[1]);

			if(x <= 1000000 && y <= 1000000 ) {
				System.out.println(String.valueOf(x+y).length());
			}
		}

		br.close();
	}
}