import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			String[] input = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
			int faces = Integer.parseInt(input[0]);
			int target = Integer.parseInt(input[1]);
			double rate = 0;
			for (int i = 1; i <= faces; i++) {
				int cnt = 0;
				int sum = i;
				while(sum < target) {
					sum += sum;
					cnt++;
				}
				rate += Math.pow(0.5, cnt) / faces;
			}
			System.out.println(String.format("%.10f", rate));
		} catch (IOException e1) {
		}
	}
}
