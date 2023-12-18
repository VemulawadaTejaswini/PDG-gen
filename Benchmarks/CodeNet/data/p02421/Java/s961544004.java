
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int pointOfTaro = 0;
		int pointOfHanako = 0;

		for (int i = 0; i < count; i++) {
			String[] strs = br.readLine().split(" ");
			if (strs[0].length() > strs[1].length()) {
				pointOfHanako = pointOfHanako + 3;
			} else if (strs[1].length() > strs[0].length()) {
				pointOfTaro = pointOfTaro + 3;
			} else {
				pointOfHanako++;
				pointOfTaro++;
			}
		}
		System.out.println(pointOfTaro + " " + pointOfHanako);
	}
}