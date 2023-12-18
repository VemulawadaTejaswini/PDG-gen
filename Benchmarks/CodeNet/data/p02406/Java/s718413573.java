import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder answer = new StringBuilder();
			int n = Integer.parseInt(input.readLine());
			if (3 <= n) {
				answer.append("3");
				for (int i = 6; i <= n; i++) {
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
			}
			System.out.print(answer.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}