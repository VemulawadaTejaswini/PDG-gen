import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] line = reader.readLine().split(" ");
		int[] N = new int[3];
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < 3; i++) {
			for (int k = i+1; k < 3; k++) {
				if (i != k) {
					int sum = Integer.parseInt(line[i]) + Integer.parseInt(line[k]); 
					if (sum < min) {
						min = sum;
					}
				}
			}
		}
		System.out.println(min);
	}
}