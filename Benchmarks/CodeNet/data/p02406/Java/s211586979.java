import java.io.BufferedReader;
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
	
	public static void main(String[] args){
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(input.readLine());
			System.out.println(call(n));
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}