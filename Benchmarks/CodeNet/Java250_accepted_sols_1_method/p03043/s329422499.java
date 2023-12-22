import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
	public static void main(String[] args) {
		try {
			String[] input = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
			int faces = Integer.parseInt(input[0]);
			int target = Integer.parseInt(input[1]);
			BigDecimal rate = BigDecimal.ZERO;
			for (int i = 1; i <= faces; i++) {
				int cnt = 0;
				int sum = i;
				while(sum < target) {
					sum += sum;
					cnt++;
				}
				rate = rate.add(BigDecimal.valueOf(Math.pow(0.5, cnt) / faces));
			}
			System.out.println(rate.setScale(10, RoundingMode.HALF_UP));
		} catch (IOException e1) {
		}
	}
}