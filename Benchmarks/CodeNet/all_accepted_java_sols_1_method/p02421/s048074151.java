import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			int n = Integer.parseInt(br.readLine());
			int i, j, taro = 0, hanako = 0;
			for (i = 0; i < n; i++) {
				String input[] = br.readLine().split(" ");
				int min = (input[0].length() < input[1].length()) ? input[0].length() : input[1].length();
				for (j = 0; j < min; j++) {
					if (input[0].charAt(j) > input[1].charAt(j)) {
						taro = taro + 3;
						break;
					} else if (input[0].charAt(j) < input[1].charAt(j)) {
						hanako = hanako + 3;
						break;
					} else if (j == min - 1) {
						if (input[0].length() > input[1].length()) {
							taro = taro + 3;
						} else if (input[0].length() < input[1].length()) {
							hanako = hanako + 3;
						} else {
							taro = taro + 1;
							hanako = hanako + 1;
						}
					}
				}
			}
			System.out.println(taro + " " + hanako);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}