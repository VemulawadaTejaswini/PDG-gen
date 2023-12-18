import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static String call(int n) {
		StringBuilder answer = new StringBuilder();
		for (int i = 3; i <= n; i++) {
			if (i % 3 == 0) {
				answer.append(" ").append(String.valueOf(i));
			} else {
				int tmp = i;
				while (tmp != 0) {
					if (tmp % 10 == 3) {
						answer.append(" ").append(String.valueOf(i));
						break;
					}
					tmp /= 10;
				}
			}
		}
		return answer.toString();
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
		System.out.println(call(n));
	}
}