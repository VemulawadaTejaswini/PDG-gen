import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		// 2020/2/2 No.153
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int h = Integer.parseInt(str[0]);
		int a = Integer.parseInt(str[1]);

		br.close();

		if(h % a == 0) {
			System.out.println(h / a);
		} else {
			System.out.println((h / a) + 1);
		}
	}
}