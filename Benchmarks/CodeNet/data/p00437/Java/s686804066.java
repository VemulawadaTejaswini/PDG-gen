import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] partstr = str.split(" ", 3);
		int numofparts = Integer.parseInt(partstr[0])
				+ Integer.parseInt(partstr[1]) + Integer.parseInt(partstr[2]);
		int[] state = new int[numofparts];
		for (int i = 0; i < numofparts; i++) {
			state[i] = 2;
		}
		str = br.readLine();
		int n = Integer.parseInt(str);
		String[][] resultstr = new String[n][4];
		for (int i = 0; i < n; i++) {
			str = br.readLine();
			resultstr[i] = str.split(" ", 4);
		}
		for (int m = 0; m < n; m++) {
			for (int l = 0; l < n; l++) {
				int i = Integer.parseInt(resultstr[l][0]) - 1;
				int j = Integer.parseInt(resultstr[l][1]) - 1;
				int k = Integer.parseInt(resultstr[l][2]) - 1;
				int r = Integer.parseInt(resultstr[l][3]);
				if (r == 1) {
					state[i] = 1;
					state[j] = 1;
					state[k] = 1;
				} else {
					if (state[i] == 1 && state[j] == 1)
						state[k] = 0;
					if (state[i] == 1 && state[k] == 1)
						state[j] = 0;
					if (state[k] == 1 && state[j] == 1) {
						state[i] = 0;
					}
				}
			}
		}
		for (int states : state) {
			System.out.println(states);
		}
	}
}