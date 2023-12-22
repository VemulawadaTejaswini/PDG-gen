import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		int num;
		String[] weight;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

			String n = br.readLine();
			String w = br.readLine();

			num = Integer.parseInt(n);
			weight = w.split(" ");
		} catch (IOException e) {

			return;
		}
		int minDiff = Integer.MAX_VALUE;
		for (int t = 1; t < num; t++) {

			int s1 = 0;
			for (int index = 0; index < t; index ++) {

				s1 += Integer.parseInt(weight[index]);
			}
			int s2 = 0;
			for (int index = t; index < num; index ++) {

				s2 += Integer.parseInt(weight[index]);
			}
			if (minDiff > Math.abs(s1 - s2)) {

				minDiff = Math.abs(s1 - s2);
			}
		}
		System.out.println(minDiff);
	}
}
