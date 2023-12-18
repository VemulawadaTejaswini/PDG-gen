import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	int n;
	int max;
	int amount[];
	static final int MAX_INT = 10000;
	public static void main(String args[]) throws IOException {
		new Main().run();
	}
	Main() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		amount = new int[MAX_INT + 1];
		max = 0;
		int index = 0;
		String line = br.readLine();
		for (int i = 0; i < n; i++) {
			int input = 0;
			while(true) {
				int ch = line.charAt(index);
				index++;
				if (ch != ' ') {
					input *= 10;
					input += ch - 48;
				} else {
					break;
				}
				if (index >= line.length()) break;
			}
			amount[input]++;
			System.out.println(input);
			max = Math.max(max, input);
		}
	}
	void run() {
		boolean flag = true;
		for (int i = 0;i < max + 1; i++) {
			for(int j = 0; j < amount[i]; j++) {
				System.out.print((flag?"":" ") + i);
				flag = false;
			}
		}
		System.out.println();
	}
}
