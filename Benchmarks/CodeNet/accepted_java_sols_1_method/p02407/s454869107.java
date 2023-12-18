import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		String[] set = br.readLine().split(" ");

		for(int i = N-1; i >= 0; i--){
			if (i != 0) {
				sb.append(set[i]).append(" ");
			} else {
				sb.append(set[i]);
			}
		}

		System.out.println(sb);

	}

}