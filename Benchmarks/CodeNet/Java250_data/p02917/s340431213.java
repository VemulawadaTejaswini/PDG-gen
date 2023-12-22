import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split(" ");
		int sum = 0;

		for (int i = 0; i < n - 1; i++) {

			if(i != 0) {
				sum += Math.min(Integer.parseInt(str[i]), Integer.parseInt(str[i - 1]));
			}
			else {
				sum += Integer.parseInt(str[i]);
			}
		}
		sum += Integer.parseInt(str[n - 2]);



		System.out.println(sum);
	}
}
