import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String strArr[] = br.readLine().split(" ");

			int n = Integer.parseInt(strArr[0]);
			int a = Integer.parseInt(strArr[1]);
			int b = Integer.parseInt(strArr[2]);
			int answer = 0;

			for (int i = 1; i < n + 1; i++) {
				int num = i;
				int sum = 0;

				while (num != 0) {
					sum += num % 10;
					num /= 10;
				}

				if (sum >= a && sum <= b ) {
					answer = answer + i;
				}
			}
			System.out.println(answer);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
