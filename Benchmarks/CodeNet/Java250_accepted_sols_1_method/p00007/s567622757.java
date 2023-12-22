import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		//??????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int N, debt;
		while ((str = br.readLine()) != null){
			N = Integer.parseInt(str);
			debt = 100000;
			for (int i = 0; i < N; i++) {
				debt = debt  / 1000 * 1050;
				if ((debt % 1000) != 0) {
					debt = debt + (1000 - debt % 1000);
				}
			}
			System.out.println(debt);
		}
	}

}