import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {
			String str = br.readLine();
			if ("0 0".equals(str)) {
				break;
			}
			String[] strS = str.split(" ");
			int[] n = new int[2];
			for (int i = 0; i < n.length; i++) {
				n[i] = Integer.parseInt(strS[i]);
			}
			if(n[0] > n[1]) {
				int temp = n[0];
				n[0] = n[1];
				n[1] = temp;
			}
			sb.append(Integer.toString(n[0]) + " " + Integer.toString(n[1]) + "\n");
		}
		System.out.print(sb);
	}

}