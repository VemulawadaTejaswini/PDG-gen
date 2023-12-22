import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(input.readLine());
			
			String[] line = input.readLine().split(" ");
			int first = Integer.parseInt(line[0]);
			int min = first;
			int max = first;
			long sum = first;
			for (int i = 1; i < n; i++) {
				int a = Integer.parseInt(line[i]);
				if (a < min) min = a;
				if (max < a) max = a;
				sum += a;
			}
			String answer = String.valueOf(min) + " " + String.valueOf(max) + " " + String.valueOf(sum);
			System.out.println(answer);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}