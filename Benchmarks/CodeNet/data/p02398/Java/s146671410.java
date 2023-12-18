import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		String[] set = num.split(" ");

		int a = Integer.parseInt(set[0]);
		int b = Integer.parseInt(set[1]);
		int c = Integer.parseInt(set[2]);

		int cnt = 0;

		for(int i = a; i<=b; i++) {
			if(c%i == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}